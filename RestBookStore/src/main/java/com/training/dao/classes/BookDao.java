package com.training.dao.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.classes.Book;
import com.training.dao.interfaces.BookInterface;
import com.training.util.HibernateUtil;

import jakarta.persistence.Query;

public class BookDao implements BookInterface {
	
	
	private static SessionFactory sessionFactory;
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public List<Book> getAllBooks() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Book");
		return query.getResultList();
	}


	public int addBook(Book book) {
		try {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(book);
		session.getTransaction().commit();
		return 1;
		}
		catch(Exception e)
		{
			return -1;
		}
		
	}


	public int deleteBook(String isbn) {
		
		try {
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			Book book = session.get(Book.class, isbn);
			session.remove(book);
			session.getTransaction().commit();
			return 1;
			}
			catch(Exception e)
			{
				return -1;
			}
	}

	
	public int updateStock(String isbn, long newStock) {
		try {
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			Book book = session.get(Book.class, isbn);
			book.setStock(book.getStock()+newStock);
			session.update(book);
			session.getTransaction().commit();
			return 1;
			}
			catch(Exception e)
			{
				return -1;
			}
	}

	
	public List<Book> getAllBooksByTitlePattern(String titlePattern) {
		
		return null;
	}

}
