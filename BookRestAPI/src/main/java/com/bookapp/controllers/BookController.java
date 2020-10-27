package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
@RequestMapping("/book-api")
@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> showAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/book-by-author/{author}")
	public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		return bookService.getByAuthor(author);
	}
	
	@GetMapping("/book-by-category")
	public List<Book> showBooksByCategory(@RequestParam("category")String category){
		return bookService.getByCategory(category);
	}
	
	@GetMapping("/book-by-id/{bookId}")
	public Book showById(@PathVariable("bookId")int id) {
		return bookService.getById(id);
	}
	@ExceptionHandler
	public String handleException(Exception e) {
		return "error:"+ e.getMessage();
		
	}
}
