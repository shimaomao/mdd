package services.brands;

import static es.eci.catalog.model.Tables.*;

import java.util.Optional;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.jooq.DSLContext;

import es.eci.catalog.model.converters.BeanPOJOConverter;
import es.eci.catalog.model.converters.POJOBeanConverter;
import es.eci.catalog.model.pojos.*;
import es.eci.catalog.model.pojos.db.*;
import es.eci.catalog.model.tables.records.*;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import services.ECIServiceVerticle;

public class Patch extends ECIServiceVerticle {
	final Logger logger = LoggerFactory.getLogger(Patch.class);
	
	protected void executeService(UserTransaction ut, DSLContext create, Message<Object> message)
			throws NotSupportedException, SystemException {
		Brand entity = (Brand) message.body();
		
		BrandBean jooqBean = POJOBeanConverter.entity2Bean(create, entity);
		
		BrandsRecord entityRecord = create.fetchOne(BRANDS, BRANDS._ID.eq(jooqBean.getId()));
		
		int numberCreated = -1;
		if (entityRecord != null) {
			entityRecord.from(jooqBean);
			numberCreated = entityRecord.update();
		}
		
		if (numberCreated > 0) {
			DeliveryOptions options = new DeliveryOptions();
			options.setCodecName("brandsinversecodec");
			BrandBean updatedEntity = new BrandBean();
			entityRecord.into(updatedEntity);
			updatedEntity.setId(entityRecord.get_Id());
			message.reply(BeanPOJOConverter.toBrand(create, updatedEntity), options);
		} else {
			message.reply(new JsonObject("{\"errors\": [\"Error al insertar record\"]}"));
		}
	}		
}		
