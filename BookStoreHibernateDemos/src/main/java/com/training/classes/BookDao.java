package com.training.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.util.HibernateUtil;

import jakarta.persistence.Query;

public class BookDao {
private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public List<Book> getAllBooks()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Book");
		return query.getResultList();
	}
}
