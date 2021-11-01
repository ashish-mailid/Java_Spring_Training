package com.training.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookDao {
	
	private SessionFactory sessionFactory;
	
	public BookDao()
	{
		Configuration configuration = new Configuration();
		configuration.configure(); // looks up hibernate.cfg.xml
		sessionFactory = configuration.buildSessionFactory();
		if(sessionFactory!=null)
			System.out.println("Connected");
	}
	
	public static void main(String[] args) {
		
		new BookDao();
	}

}
