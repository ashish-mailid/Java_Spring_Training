package com.training;

import java.util.List;

import com.training.classes.Book;
import com.training.dao.classes.BookDao;
import com.training.dao.interfaces.BookInterface;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bookstore")
public class BookResource {
	
	private BookInterface bookDao;
	
	public BookResource()
	{
		bookDao = new BookDao();
	}

	@Path("/sayhello")  // http://localhost:8081/RestBookStore/rest/bookstore/sayhello
	@GET
	public String sayHello()
	{
		return "Hello World ! This is my first Rest API Get message";
	}
	
	
	@Path("/sayhellopost")
	@POST
	public String sayHelloPost()
	{
		return "Hello World ! This is my first Rest API Post Message";
	}
	
	@Path("/getbooks")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<Book> getBooks()
	{
		return bookDao.getAllBooks();
	}
	
	//http://localhost:8081/RestBookStore/rest/bookstore/addbook
	@Path("/addbook")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public int addBook(Book book)
	{
		return bookDao.addBook(book);
	}
	
	//http://localhost:8081/RestBookStore/rest/bookstore/deletebook/isbn/1234    PathVariable
	@Path("/deletebook/isbn/{isbn}")
	@DELETE
	public int deleteBook(@PathParam("isbn") String isbn)
	{
		return bookDao.deleteBook(isbn);
	}
	
	@POST
	//http://localhost:8081/RestBookStore/rest/bookstore/updatebook/isbn/1247/stock/150
	@Path("/updatebook/isbn/{isbn}/stock/{newstock}")
	public int updateBook(@PathParam("isbn") String isbn,@PathParam("newstock") long newStock)
	{
		return bookDao.updateStock(isbn, newStock);
	}
}
