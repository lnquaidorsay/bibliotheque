package com.biblio.fr.biblio.entite;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;

public class BookDTODeserializer extends StdDeserializer<BookDTO> {

	@Override
	public BookDTO deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		JsonNode node = p.getCodec().readTree(p);
		// Integer id = (Integer) ((IntNode) node.get("id")).numberValue();
		String title = node.get("title").asText();
		String isbn = node.get("isbn").asText();
		String string = "2018-04-10T04:00:00.000Z"; // 2021-01-05T00:00:00.000Z
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println("convertir date test : " + date);
		/*
		 * LocalDate releaseDate = LocalDate.parse(node.get("releaseDate").asText());
		 * LocalDate registerDate = LocalDate.parse(node.get("registerDate").asText());
		 */
		LocalDate releaseDate = LocalDate.parse(node.get("releaseDate").asText(), formatter);
		// LocalDate registerDate = LocalDate.parse(node.get("registerDate").asText(),
		// formatter);
		System.out.println("releaseDate  : " + releaseDate);
		// System.out.println("registerDate : " + registerDate);
		Integer totalExamplaries = (Integer) ((IntNode) node.get("totalExamplaries")).numberValue();
		String author = node.get("author").asText();
		// String codeCategory = node.get("code").asText();
		String codeCategory = "I";
		// String labelCategory = node.get("label").asText();
		String labelCategory = "Informatique";

		return new BookDTO(title, isbn, releaseDate, totalExamplaries, author,
				new CategoryDTO(codeCategory, labelCategory));
		// return null;
	}

	public BookDTODeserializer(Class<?> vc) {
		super(vc);
		// TODO Auto-generated constructor stub
	}

	public BookDTODeserializer(JavaType valueType) {
		super(valueType);
		// TODO Auto-generated constructor stub
	}

	public BookDTODeserializer(StdDeserializer<?> src) {
		super(src);
		// TODO Auto-generated constructor stub
	}

	public BookDTODeserializer() {
		super(BookDTO.class);
	}

}