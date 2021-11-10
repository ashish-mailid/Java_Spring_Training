package com.training.services.classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Book;
import com.training.repo.BookRepo;
import com.training.services.interfaces.BookServiceI;

@Service
public class BookService implements BookServiceI{
	
	@Autowired
	private BookRepo bookRepo;


	@Override
	public Book addbook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}

	@Override
	public Book getBook(String isbn) {
		Optional<Book> opBook = bookRepo.findById(isbn);
		
		if(opBook.isPresent())
		return opBook.get();
		return null;
	}

	@Override
	public Book deleteBook(String isbn) {
		
		Optional<Book> opBook = bookRepo.findById(isbn);
		Book book=null;
		if(opBook.isPresent())
		{
			book = opBook.get();
			bookRepo.delete(book);
			return book;
		}
		return null;
	}

	@Override
	public Book upateBook(String isbn, long newStock) {
		
		Optional<Book> opBook = bookRepo.findById(isbn);
		Book book=null;
		if(opBook.isPresent())
		{
			book = opBook.get();
			book.setStock(book.getStock()+newStock);
			bookRepo.save(book);
			return book;
		}
		return null;
	}

}
