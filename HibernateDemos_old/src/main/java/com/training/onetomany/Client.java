package com.training.onetomany;

import java.util.Arrays;
import java.util.List;

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
		Customer sam = new Customer("Samson");
		
		Complaint c1=new Complaint("Modem is not working");
		Complaint c2=new Complaint("Bill not received");
		
		
		List<Complaint> complaints = Arrays.asList(c1,c2);
		
		
		sam.setCompliants(complaints);
		
		
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(sam);
		session.getTransaction().commit();
	}

}
