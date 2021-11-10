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
import com.training.services.interfaces.BookServiceI;

@RestController
@RequestMapping("/store")
public class BookController {
	
	@Autowired
	private BookServiceI bookService;
	
	//localhost:8082/store/addbook
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book)
	{
		return bookService.addbook(book);
	}
	
	
	//localhost:8082/store/getallbooks
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	//localhost:8082/store/deletebook/isbn/1234
	@DeleteMapping("/deletebook/isbn/{isbn}")
	public Book deleteBook(@PathVariable("isbn") String isbn)
	{
		return bookService.deleteBook(isbn);
	}
	
	//localhost:8082/store/updatebook/isbn/3456/stock/50
	@PostMapping("/updatebook/isbn/{isbn}/stock/{stock}")
	public Book updateBook(@PathVariable("isbn") String isbn,@PathVariable("stock") long newStock)
	{
		return bookService.upateBook(isbn, newStock);
	}
	
	//localhost:8082/store/getbook/isbn/3459
	@GetMapping("/getbook/isbn/{isbn}")
	public Book getBook(@PathVariable("isbn") String isbn)
	{
		return bookService.getBook(isbn);
	}
}





