package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.classes.Customer;
import com.training.classes.Customer2;
import com.training.classes.Employee;
import com.training.classes.Employee2;
import com.training.classes.Person;
import com.training.classes.Person2;
import com.training.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App2 
{
	private static SessionFactory sessionFactory;
	
	static{
		sessionFactory= HibernateUtil.getSessionFactory();
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*
		 * Person2 p1=new Person2(); p1.setName("sam");
		 * 
		 * Employee2 emp=new Employee2(); emp.setName("peter"); emp.setDept("sales");
		 * 
		 * Customer2 c=new Customer2(); c.setName("john"); c.setEmail("john@gmail.com");
		 * 
		 * Session session = sessionFactory.openSession();
		 * session.getTransaction().begin(); session.save(p1); session.save(c);
		 * session.save(emp); session.getTransaction().commit();
		 */
        
        Session session = sessionFactory.openSession();
        Person2 p1= session.get(Person2.class, 18l);
        System.out.println(p1);
        
    }
}





