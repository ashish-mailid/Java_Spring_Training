package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.classes.Book;
import com.training.dbconnection.DbConnection;
import com.training.interfaces.BookDaoInterface;

public class BookStoreDao implements BookDaoInterface {
	
	private static Connection connection;
	
	public BookStoreDao()
	{
		connection = DbConnection.getConnection();
		if(connection != null)
			System.out.println("Connection Successful");
		else
			System.out.println("Not connected");
		
	}

	// retrieve all records
	public List<Book> getAllBooks()
	{
		List<Book> bookList = new ArrayList<>();
		// Step 3 Create a statement or prepare a statement.
		Statement stmt=null;
		try {
			stmt= connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while(rs.next())
			{
				Book book = new Book(rs.getString("isbn"), rs.getString("title"), rs.getDouble("price"), 
						rs.getLong("stock"), rs.getString("category"));
				
				bookList.add(book);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public int addBook(Book book) {
		PreparedStatement pstmt;
		String template = "insert into book values(?,?,?,?,?)";
		
		try {
			pstmt = connection.prepareStatement(template);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setLong(4, book.getStock());
			pstmt.setString(5, book.getCategory());
			return pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int deleteBook(String isbn) {
		
		PreparedStatement pstmt;
		String template = "delete from book where isbn=?";
		
		try {
			pstmt = connection.prepareStatement(template);
			pstmt.setString(1, isbn);
			return pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int updateStock(String isbn, long newStock) {
		PreparedStatement pstmt;
		String template = "update book set stock=stock+? where isbn=?";
		
		try {
			pstmt = connection.prepareStatement(template);
			pstmt.setLong(1, newStock);
			pstmt.setString(2, isbn);
			return pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<Book> getAllBooksByTitlePattern(String titlePattern) {
		PreparedStatement pstmt;
		String template = "select * from book where title like ?";
		List<Book> bookList = new ArrayList<>();
		try {
			pstmt = connection.prepareStatement(template);
			pstmt.setString(1, "%"+titlePattern+"%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				Book book = new Book(rs.getString("isbn"), rs.getString("title"), rs.getDouble("price"), 
						rs.getLong("stock"), rs.getString("category"));
				
				bookList.add(book);
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return bookList;
	}
		
}





