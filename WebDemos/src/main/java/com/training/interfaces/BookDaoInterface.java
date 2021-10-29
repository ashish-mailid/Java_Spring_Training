package com.training.interfaces;

import java.util.List;

import com.training.classes.Book;

public interface BookDaoInterface {
	
	public List<Book> getAllBooks();
	public int addBook(Book book);
	public int deleteBook(String isbn);
	public int updateStock(String isbn,long newStock);
	public List<Book> getAllBooksByTitlePattern(String titlePattern);
	

}
