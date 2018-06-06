package services.images;

import java.util.Arrays;

import es.eci.catalog.model.pojos.Image;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class ImagesInverseCodec implements MessageCodec<Image, JsonObject> {
	
	final Logger logger = LoggerFactory.getLogger(ImagesInverseCodec.class);

	@Override
	public void encodeToWire(Buffer buffer, Image entity) {
		JsonObject jsonToEncode = entity2JsonObject(entity);
		String json = jsonToEncode.encode();
		
		logger.info("encoding: " + json);
		
		buffer.appendInt(json.getBytes().length);
		buffer.appendString(json);
	}

	@Override
	public JsonObject decodeFromWire(int pos, Buffer buffer) {
		int _pos = pos;
		int length = buffer.getInt(_pos);
		
		// Get JSON string by it`s length
		// Jump 4 because getInt() == 4 bytes
		String json = buffer.getString(_pos += 4, _pos += length);
		JsonObject contentJson = new JsonObject(json);		
		logger.debug("decoding: " + contentJson);
		
		return contentJson;
	}

	@Override
	public JsonObject transform(Image entity) {
		return entity2JsonObject(entity);
	}
	
	public static JsonObject entity2JsonObject(Image entity) {
	
		if (entity == null) return null;
	
		JsonObject jsonToEncode = new JsonObject();
		
		jsonToEncode.put("url", entity.getUrl());
		jsonToEncode.put("description", entity.getDescription());
		jsonToEncode.put("id", entity.getId());
		
		
		return jsonToEncode;
	}

	@Override
	public String name() {
		return this.getClass().getSimpleName().toLowerCase();
	}

	@Override
	public byte systemCodecID() {
		return -1;
	}

}
	