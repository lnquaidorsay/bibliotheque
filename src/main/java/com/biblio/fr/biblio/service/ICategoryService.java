package com.biblio.fr.biblio.service;

import java.util.List;

import com.biblio.fr.biblio.entite.Category;

public interface ICategoryService {
	public List<Category> getAllCategories();

	public Category findCategoryByCode(String code);
}
