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

import com.training.entity.Book;
import com.training.services.BookService;

@RestController
@RequestMapping("/store")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/hello")       // http://localhost:8081/store/hello
	public String sayHello()
	{
		return "Hello Spring Boot";
	}
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return bookService.getBooks();
	}

	@GetMapping("/book/isbn/{isbn}")
	public Book getBook(@PathVariable("isbn") long isbn)
	{
		return bookService.getBook(isbn);
	}
	
	@DeleteMapping("/delbook/isbn/{isbn}")
	public Book delBook(@PathVariable("isbn") long isbn)
	{
		return bookService.delBook(isbn);
	}
	
	@PostMapping("/updatebook/isbn/{isbn}/stock/{newstock}")
	public Book updateBook(@PathVariable("isbn") long isbn,@PathVariable("newstock") long newStock)
	{
		return bookService.updateBook(isbn, newStock);
	}
	
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
}
