package com.store.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.store.db.DbConnection;
import com.store.interfaces.BookDaoI;

public class BookDao implements BookDaoI{
private static Connection connection;
	static{
		connection=DbConnection.getConnection();
	}
	@Override
	public List<Book> getAllBooks() {
		String template = "select * from Book";
		try{
		Statement stmt=connection.createStatement();
		ResultSet rs = stmt.executeQuery(template);
		List<Book> bookList=new ArrayList<>();
		while(rs.next())
		{
			Book book=new Book(
			rs.getString(1), //isbn
			rs.getString(2),//title
			rs.getString(3),//author
			rs.getDouble(4),//price
			rs.getLong(5));//stock
			bookList.add(book); 
		}
		return bookList;
		
		}catch(SQLException e)
		{
			System.out.println(e); return null;
		}
		
	}
	
	

}
