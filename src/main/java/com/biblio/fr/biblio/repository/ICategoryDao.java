package com.biblio.fr.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblio.fr.biblio.entite.Category;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Integer> {

}
