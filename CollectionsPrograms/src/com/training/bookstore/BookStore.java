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
	
	public Book getBook(String isbn)
	{
		for(Book b:books)
		{
			if(b.getIsbn().equalsIgnoreCase(isbn))
				return b;
		}
		return null;
	}
	public boolean addBook(Book b1)
	{
		if(getBook(b1.getIsbn())==null) {
		books.add(b1);
		return true;
		}
		return false;
	}
	public boolean deleteBook(String isbn)
	{
		Book b1=getBook(isbn);
		if(b1!=null) {
			books.remove(b1);
			return true;
		}
		return false;
			
	}
	public boolean updateStockBook(String isbn,long newStock)
	{
		Book b1=getBook(isbn);
		if(b1!=null) {
			b1.setStock(b1.getStock()+newStock);
			return true;
		}
		return false;
	}
	
	
	public List<Book> getBooksPattern(String titlePattern) // C, CP,   C , Cplus
	{
		List<Book> booksPattern = new ArrayList<Book>();
		for(Book book : books)
		{
			if(book.getTitle().contains(titlePattern))
				booksPattern.add(book);
		
		}
		return booksPattern;
	}
}



