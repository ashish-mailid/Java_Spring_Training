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
			return customer;
		}
		return null;
	}

	public static void main(String[] args) {
		LoginDao loginDao=new LoginDao();
		
		//add record to usersnew and customernew
		
		
		  /*Login loginCustomer = new Login("sam", "sam123", "ROLE_CUSTOMER");
		  
		  Customer customer1 = new Customer("Samson","sam@gmail.com", "9853567777",
		  loginCustomer);
		  
		  //Addresses
		  List<Address> addressList = Arrays.asList(new Address(101, "Church St", "Bengaluru", "KA"),
				  new Address(402, "Mount rd", "Chennai", "TN"));
		  
		  customer1.setAddressList(addressList);
		
		  Session session = sessionFactory.openSession();
		  session.getTransaction().begin(); session.save(customer1); // cascades
		  session.getTransaction().commit();  */
		 
				
		Customer customer = loginDao.validateUser("sam", "sam123");
		System.out.println("Customer Details"+customer);
		System.out.println(customer.getAddressList());
		
		// customer can update his phone no based on username
		
		// customer can delete address  based on username
		
		// customer can add a new address based on username
		
	}
}








