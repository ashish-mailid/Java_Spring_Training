package com.training.dbconnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	  private static String jdbcDriver;
	  private static String url;
	  private static String username;
	  private static String password;
	 
	private static Connection connection;
	
	private final String PROPERTIES= "dbconfig.properties";
	
	public void readProperties()
	{
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(PROPERTIES);
		Properties properties = new Properties();
		
		try {
			properties.load(inputStream);
			jdbcDriver = properties.getProperty("db.jdbc.driver");
			url=properties.getProperty("db.url");
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		
		new DbConnection().readProperties();
		
		try {
			// Step 1  loads the JDBC driver
			Class.forName(jdbcDriver);
			//Step 2 getting the connection to DB
			
			 connection = DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
