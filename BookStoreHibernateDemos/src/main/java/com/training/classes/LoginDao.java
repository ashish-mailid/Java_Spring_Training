package com.training.classes;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.util.HibernateUtil;

import jakarta.persistence.Query;


public class LoginDao {
	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public Customer validateUser(String username,String password)
	{
		// check in the table if credentials exist or not.
		//if credentials are right
		//returns the details of Customer
		// Customer table has name,email,phoneno and username
		
		Session session = sessionFactory.openSession();
		Login login = session.get(Login.class, username);// based on primary key
		
		if(login!=null && login.getPassword().equals(password))
		{
			//retrieve Customer based on username
			Query query = session.createQuery("from Customer c where c.login.username=:username");
			query.setParameter("username", username);
			Customer customer = (Customer) query.getSingleResult();
			//System.out.println(customer.getLogin().getUsername());
			session.close();
			return customer;
		}
		return null;
	}

	
}








