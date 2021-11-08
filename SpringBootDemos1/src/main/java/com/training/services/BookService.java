package com.training.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.entity.Book;
import com.training.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	
	public BookService()
	{ 
		//books = Arrays.asList(new Book(1234, "C", 150.25, 100),new Book(5678, "CPlus",250.25, 100),
				//new Book(3456, "Python", 170.25, 100));
		
	}
	
	public List<Book> getBooks()
	{
		return bookRepo.findAll();
	}

	public Book getBook(long isbn)
	{
		Optional<Book> opBook = bookRepo.findById(isbn);
		if(opBook.isPresent())
			return opBook.get();
		return null;
	}
	
	public Book delBook(long isbn)
	{
		Book b1= getBook(isbn);
		if(b1!=null) {
			bookRepo.delete(b1);
		return b1;	
		}
		//bookRepo.deleteById(isbn);
		return null;
	}
	
	public Book updateBook(long isbn,long newStock)
	{
		Book b1= getBook(isbn);
		if(b1!=null) {
			b1.setStock(b1.getStock()+newStock);
			bookRepo.save(b1);
		return b1;	
		}
		return null;
	}
	
	public Book addBook(Book book)
	{
		return bookRepo.save(book);
	}
	
	
}
