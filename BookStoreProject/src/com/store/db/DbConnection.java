package com.store.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static Connection connection;
	
	public static Connection getConnection() {
		return connection;
	}

	public DbConnection() { }
	
	public DbConnection(String jdbcDriver,String dbUrl,String username,String password)
	{
		try{
		Class.forName(jdbcDriver);
		connection = DriverManager.getConnection(dbUrl,username,password);
		if(connection !=null)
		{
			System.out.println("Connection Successful..");
		}
		}catch(SQLException | ClassNotFoundException e){System.out.println(e);}
	}
	
}
