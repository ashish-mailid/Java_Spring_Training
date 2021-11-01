package com.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.training.classes.Book;

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


	public List<Book> getBooks()
	{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Book");
		@SuppressWarnings("unchecked")
		List<Book> list1 =query.getResultList();
		return list1;

	}

	public Book getBook(String isbn)
	{
		try(Session session = sessionFactory.openSession()) {

			Book book = (Book) session.get(Book.class, isbn);
			return book;

		}catch(Exception e)
		{
			//e.printStackTrace(); 
		}
		return null;
	}

	public boolean deleteBook(String isbn)
	{
		try(Session session = sessionFactory.openSession()) {

			Book book = getBook(isbn);
			System.out.println(book);
			if(book!=null)
			{
				session.getTransaction().begin();
				session.delete(book);
				session.getTransaction().commit();
			}

		}catch(Exception e)
		{
			//e.printStackTrace();
			return false;
		}
		return false;
	}

	public boolean addBook(Book book)
	{
		try(Session session = sessionFactory.openSession()) {

			session.getTransaction().begin();
			session.save(book);
			session.getTransaction().commit();
		}catch(Exception e)
		{
			
			
			return false;
		}
		return true;
	}


	public static void main(String[] args) {

		BookDao bookDao = new BookDao();
		//	System.out.println(bookDao.addBook(new Book("9871", "Rich Dad Poor Dad", 185.25, 100,"Motivational")));

		System.out.println(bookDao.getBooks());
		
		boolean status = bookDao.deleteBook("1234");
		if(status) System.out.println("Deleted");
		else System.out.println("Book Not found");
		
		System.out.println("----------------------------------------");
		System.out.println(bookDao.getBooks());


	}

}
