package com.biblio.fr.biblio.entite;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Book Model")
//@JsonIgnoreProperties(ignoreUnknown = true)
/*
 * https://www.baeldung.com/jackson-deserialization
 * https://stackoverflow.com/questions/55032293/cannot-construct-instance-of-
 * class-name-although-at-least-on-creator-exists
 * https://stackoverflow.com/questions/45110371/no-string-argument-constructor-
 * factory-method-to-deserialize-from-string-value/45110497
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = BookDTODeserializer.class)
public class BookDTO implements Comparable<BookDTO> {
	@ApiModelProperty(value = "Book id")
	private Integer id;

	@ApiModelProperty(value = "Book title")
	private String title;

	@ApiModelProperty(value = "Book isbn")
	private String isbn;

	@ApiModelProperty(value = "Book release date by the editor")
	private LocalDate releaseDate;

	@ApiModelProperty(value = "Book register date in the library")
	private LocalDate registerDate;

	@ApiModelProperty(value = "Book total examplaries")
	private Integer totalExamplaries;

	@ApiModelProperty(value = "Book author")
	private String author;

	@ApiModelProperty(value = "Book category")
	private CategoryDTO category;

	@ApiModelProperty(value = "Book category")
	private Category categ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public Integer getTotalExamplaries() {
		return totalExamplaries;
	}

	public void setTotalExamplaries(Integer totalExamplaries) {
		this.totalExamplaries = totalExamplaries;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public Category getCateg() {
		return categ;
	}

	public void setCateg(Category categ) {
		this.categ = categ;
	}

	@Override
	public int compareTo(BookDTO o) {
		return title.compareToIgnoreCase(o.getTitle());
	}

	public BookDTO() {
		super();
	}

	public BookDTO(String title, String isbn, LocalDate releaseDate, Integer totalExamplaries, String author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.releaseDate = releaseDate;
		this.totalExamplaries = totalExamplaries;
		this.author = author;
	}

	/*
	 * public BookDTO(String title, String isbn, Integer totalExamplaries, String
	 * author, CategoryDTO category) { super(); this.title = title; this.isbn =
	 * isbn; this.totalExamplaries = totalExamplaries; this.author = author;
	 * this.category = category; }
	 */

}
