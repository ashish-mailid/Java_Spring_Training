package com.training.services.interfaces;

import java.util.List;

import com.training.bean.Book;

public interface BookServiceI {
	
	public Book addbook(Book book);
	public List<Book> getAllBooks();
	public Book getBook(String isbn);
	public Book deleteBook(String isbn);
	public Book upateBook(String isbn,long newStock);

}
