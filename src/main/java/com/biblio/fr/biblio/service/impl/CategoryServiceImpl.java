package com.biblio.fr.biblio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.fr.biblio.entite.Category;
import com.biblio.fr.biblio.repository.ICategoryDao;
import com.biblio.fr.biblio.service.ICategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private ICategoryDao categoryDao;

	@Override
	public List<Category> getAllCategories() {
		return categoryDao.findAll();
	}

	@Override
	public Category findCategoryByCode(String code) {
		return categoryDao.findCategoryByCode(code);
	}

}
