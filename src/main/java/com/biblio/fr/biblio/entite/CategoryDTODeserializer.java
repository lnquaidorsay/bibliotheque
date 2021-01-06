package com.biblio.fr.biblio.entite;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CategoryDTODeserializer extends StdDeserializer<CategoryDTO> {

	@Override
	public CategoryDTO deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);
		String codeCategory = node.get("code").asText();
		String labelCategory = node.get("label").asText();
		return new CategoryDTO(codeCategory, labelCategory);
	}

	public CategoryDTODeserializer(Class<?> vc) {
		super(vc);
		// TODO Auto-generated constructor stub
	}

	public CategoryDTODeserializer(JavaType valueType) {
		super(valueType);
		// TODO Auto-generated constructor stub
	}

	public CategoryDTODeserializer(StdDeserializer<?> src) {
		super(src);
		// TODO Auto-generated constructor stub
	}

	public CategoryDTODeserializer() {
		super(CategoryDTO.class);
	}

}
