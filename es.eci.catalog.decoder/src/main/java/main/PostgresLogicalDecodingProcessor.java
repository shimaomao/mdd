package main;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.StringUtils;

import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class PostgresLogicalDecodingProcessor implements Processor {
	
	final Logger logger = LoggerFactory.getLogger(PostgresLogicalDecodingProcessor.class);
	
	private Vertx vertx;
	private String kafkaProducerAddress;
	

	public PostgresLogicalDecodingProcessor(Vertx vertx, String address) {
		this.vertx = vertx;
		this.kafkaProducerAddress = address;
	}

	@Override
	public void process(Exchange exchange) {
		logger.info("received message");
		@SuppressWarnings("unchecked")
		JsonArray messages = new JsonArray((List<JsonObject>) exchange.getIn().getBody());
		logger.debug(messages.getValue(0).getClass().getName());
		Map<Object, List<Object>> linesByXID = messages.stream().collect(Collectors.groupingBy(line -> ((JsonObject) line).getValue("xid")));
		
		try {
			linesByXID.forEach((k,v) -> {
				v.forEach(line -> {
					String jsonData = ((JsonObject) line).getString("data");
					JsonObject json = new JsonObject(jsonData);
					String transactionType = json.getString("type");
					if (StringUtils.isNotEmpty(transactionType) && !transactionType.startsWith("transaction")) {
						JsonObject data = json.getJsonObject("data");
						String tableName = json.getString("name");
						String change = json.getString("change");
						logger.info(String.format("Sending to %s, table: %s, change: %s, data:\n%s", kafkaProducerAddress, tableName, change, data));
						DeliveryOptions options = new DeliveryOptions();
						options.addHeader("table", tableName);
						options.addHeader("change", change);
						vertx.eventBus().send(kafkaProducerAddress, data, options, message -> {
							if (message.succeeded()) {
								logger.info(String.format("Message delivered successfully: %s", data));
							} else {
								logger.error(message.result());
							}
						});
					}
				});
			});
			exchange.getOut().setBody(messages, JsonArray.class);
		} catch (Exception e) {
			logger.error("Received commits from postgres but unable to send through vertx event bus.", e);
		}
	}
}
