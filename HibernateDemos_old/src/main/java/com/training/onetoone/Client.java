package com.training.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.util.HibernateUtil;

public class Client {

	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public static void main(String[] args) {
		
		// add records
		
		  Session session = sessionFactory.openSession(); 
		  Address address1 = new  Address(203, "Church St", "New Delhi"); 
		  User user1 = new User("Peter");
		  user1.setAddress(address1);
		  
		  session.getTransaction().begin(); session.save(user1);
		  session.getTransaction().commit(); session.close();
		 
		
		/*
		 * Session session = sessionFactory.openSession(); User user =
		 * session.get(User.class, 2); System.out.println(user);
		 */
		
		
		//update the address of sam based on user id
		
		/*
		 * Session session = sessionFactory.openSession(); User user =
		 * session.get(User.class, 2); session.getTransaction().begin();
		 * user.setAddress(new Address(123, "Some st", "Bangalore"));
		 * session.update(user); session.getTransaction().commit();
		 */
		
		/*
		 * Session session = sessionFactory.openSession(); User user =
		 * session.get(User.class, 2); session.getTransaction().begin();
		 * session.remove(user); session.getTransaction().commit();
		 */
		
		/*
		 * Session session = sessionFactory.openSession(); Address ad =
		 * session.get(Address.class, 5); session.getTransaction().begin();
		 * session.remove(ad); session.getTransaction().commit();
		 */
	}

}
