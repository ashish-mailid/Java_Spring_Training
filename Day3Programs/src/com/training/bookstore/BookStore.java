package com.training.bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}

	public BookStore()
	{
		books = new ArrayList<>();
	}
	
	public boolean addBook(Book b1)
	{
		return false;
	}

	public boolean deleteBook(String isbn)
	{
		return false;
	}
	public boolean updateStockBook(String isbn,long newStock)
	{
		return false;
	}
	
	public Book getBook(String isbn)
	{
		return null;
	}
	
	public List<Book> getBooksPattern(String titlePattern)
	{
		return null;
	}
}



