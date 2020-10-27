package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	Book getById(int Id);
	List<Book> getByCategory(String category);
}
