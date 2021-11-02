package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.classes.Customer;
import com.training.classes.Employee;
import com.training.classes.Person;
import com.training.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory sessionFactory;
	
	static{
		sessionFactory= HibernateUtil.getSessionFactory();
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person p1=new Person();
        p1.setName("sam");
        
        Employee emp=new Employee();
        emp.setName("peter");
        emp.setDept("sales");
        
        Customer c=new Customer();
        c.setName("john");
        c.setEmail("john@gmail.com");
        
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(p1);
        session.save(c);
        session.save(emp);
        session.getTransaction().commit();
    }
}
