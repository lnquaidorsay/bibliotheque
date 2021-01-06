package com.biblio.fr.biblio.service;

import java.util.List;

import com.biblio.fr.biblio.entite.Book;

public interface IBookService {
	public List<Book> getAllBooks();

	public Book saveBook(Book book);

	public Book updateBook(Book book);

	public void deleteBook(Integer bookId);

	public List<Book> findBooksByTitleOrPartTitle(String title);

	public Book findBookByIsbn(String isbn);

	public boolean checkIfIdExists(Integer id);

	public List<Book> getBooksByCategory(String codeCategory);
}
