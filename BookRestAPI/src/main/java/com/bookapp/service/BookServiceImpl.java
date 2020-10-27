package com.bookapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookDAO bookDAO;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newbooklist=new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getAuthor().equals(author))
				newbooklist.add(book);
		}
		return newbooklist;
	}

	@Override
	public Book getById(int Id) {
		// TODO Auto-generated method stub
		for( Book book:showBookList()) {
			if(book.getBookId()==Id)
				return book;
		}
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newbooklist=new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getCategory().equals(category))
				newbooklist.add(book);
		}	
		return newbooklist;
	}

	private List<Book> showBookList(){
        return Arrays.asList(
                new Book(1,"learn java","kathy","tech",900.0),
                new Book(2,"learn c++","kathy","tech",900.0),
                new Book(3,"wise otherwise","sudhamurthy","selfguide",900.0),
                new Book(4,"learn python","dussen","tech",900.0));
                }
	
	
			
}
