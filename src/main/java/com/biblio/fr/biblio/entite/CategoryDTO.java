package com.biblio.fr.biblio.entite;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Category Model")
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = CategoryDTODeserializer.class)
public class CategoryDTO implements Comparable<CategoryDTO> {
	public CategoryDTO() {
	}

	public CategoryDTO(String code, String label) {
		super();
		this.code = code;
		this.label = label;
	}

	@ApiModelProperty(value = "Category id")
	private Integer id;

	@ApiModelProperty(value = "Category code")
	private String code;

	@ApiModelProperty(value = "Category label")
	private String label;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(CategoryDTO o) {
		return label.compareToIgnoreCase(o.label);
	}
}
