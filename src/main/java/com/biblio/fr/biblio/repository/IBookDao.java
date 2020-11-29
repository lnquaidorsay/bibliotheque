package com.biblio.fr.biblio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.biblio.fr.biblio.entite.Book;

@Repository
public interface IBookDao extends JpaRepository<Book, Integer> {

	/*
	 * En général, toute méthode dans une classe Spring Data JPA qui n'est marquée
	 * d'aucune annotation et qui commence par le préfixe find ou findBy est prise
	 * en charge par ce dernier. Dans cet exemple, il génèrera à l'invocation de
	 * chacune de ces méthodes les requêtes suivantes :
	 * 
	 * findAll() : select t from T t ; findByXxxAndYyyIgnoreCase(String xXX, String
	 * yYYY) : select t from T t where lower(t.xXX) = lower(xXX) and lower(t.yYY) =
	 * lower(yYYY). La casse est ignorée lors de la comparaison sur les paramètres
	 * d'entrée.
	 */
	public Book findByIsbnIgnoreCase(String isbn);

	public List<Book> findByTitleLikeIgnoreCase(String title);

	@Query("SELECT b " + "FROM Book b " + "INNER JOIN b.category cat " + "WHERE cat.code = :code")
	public List<Book> findByCategory(@Param("code") String codeCategory);
}
