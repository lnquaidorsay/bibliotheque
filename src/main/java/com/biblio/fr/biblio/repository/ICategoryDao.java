package com.biblio.fr.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.biblio.fr.biblio.entite.Category;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Integer> {
	@Query("SELECT c FROM Category c WHERE c.code = ?1")
	public Category findCategoryByCode(String code);

	Category findByCode(String code);
}
