package com.training.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.bean.Book;

@Component
public class BookData {
	
	private List<Book> bookList;
	
	public BookData()
	{
		bookList = new ArrayList<Book>(Arrays.asList(new Book("7886","Alchemist",150.25,100,"Motivational"),
					new Book("1234","Think like a Monk",250.25,100,"Motivational"),
					new Book("2345","Ikigai",220.25,100,"Motivational")));
	}
	
	public List<Book> getAllBooks()
	{
		return bookList;
	}

	public Book getBook(String isbn)
	{
		for(Book book: bookList)
		{
			if(book.getIsbn().equalsIgnoreCase(isbn))
				return book;
			
		}
		return null;
	}
	
	public int addBook(Book book)
	{
		bookList.add(book);
		return 1;
	}
	
	public int deleteBook(String isbn)
	{
		for(Book book: bookList)
		{
			if(book.getIsbn().equalsIgnoreCase(isbn))
			{
				bookList.remove(book);return 1;
			}
			
		}
		return 0;
	}
}
