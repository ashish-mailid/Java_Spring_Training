package com.training.bean;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.training.util.HibernateUtil;

public class ClientTestCriteria {

private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public static void main(String[] args) {
		Session session = sessionFactory.openSession();
		
		Criteria cr1 = session.createCriteria(Product.class);
		List<Product> results1 = cr1.list();
		print(results1);
		
	//	  cr1.add(Restrictions.gt("price", 100.0));
		  
	//	  System.out.println("----------------");
	//	  print(cr1.list());
		  
	//	  System.out.println("---------------------");
		  
		// cr1.add(Restrictions.between("price", 110.0, 130.0));
		  
	//	print(cr1.list());
		
		// product whose stock is above 110
	//	System.out.println("--------------");
		//cr1.add(Restrictions.gt("stock", 110l));
	//	System.out.println("---------------------");
		//print(cr1.list());
		System.out.println("------------------------------");
		cr1.add(Restrictions.in("name", new String[]{"Oregano","chocos"}));
		System.out.println("---------------------");
		print(cr1.list());
		
		 

	}
	private static void print(List<Product> results1) {
		for(Product p:results1)
			System.out.println(p);
		
	}

}
