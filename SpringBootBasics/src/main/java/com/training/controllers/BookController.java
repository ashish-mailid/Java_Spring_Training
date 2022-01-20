package com.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Book;
import com.training.data.BookData;


@RequestMapping("/books")
@RestController
public class BookController {
	
	@Autowired
	private BookData bookData;
	
	
	@GetMapping("/hello")    // http://localhost:8081/books/hello
	public String sayHello()
	{
		return "Hello! This is my First Rest Service";
	}

	@GetMapping("/getbooks")
	public List<Book> getBooks()
	{
		return bookData.getAllBooks();
	}
	
	@GetMapping("/getbook/isbn/{isbn}") // localhost:8081/books/getbook/isbn/1234
	public Book getBook(@PathVariable("isbn") String isbn)
	{
		return bookData.getBook(isbn);
	}

	@PostMapping("/addbook")
	public int addBook(@RequestBody Book book)
	{
		return bookData.addBook(book);
	}

	@DeleteMapping("/deletebook/isbn/{isbn}") 
	public int deleteBook(@PathVariable("isbn") String isbn)
	{
		return bookData.deleteBook(isbn);
	}
	
	
}
