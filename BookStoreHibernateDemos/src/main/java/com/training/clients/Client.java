package com.training.clients;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.training.classes.Address;
import com.training.classes.Customer;
import com.training.classes.LoginDao;
import com.training.util.HibernateUtil;

public class Client {
private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
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
			
						
			
			/*
			 * Session session = sessionFactory.openSession();
			 * session.getTransaction().begin(); customer.setPhone("000000000");
			 * session.update(customer); session.getTransaction().commit();
			 */
			 
			
			// customer can delete address  based on username
			/*
			 * Session session = sessionFactory.openSession();
			 * session.getTransaction().begin(); List<Address> list1 =
			 * customer.getAddressList(); for(Address a:list1) { if(a.getAddId()==4)
			 * list1.remove(a); } customer.setAddressList(list1);
			 * session.saveOrUpdate(customer);
			 * 
			 * 
			 * session.getTransaction().commit(); session.close();
			 */
			
			//System.out.println(customer.getAddressList());
			
			// customer can add a new address based on username
			
		}
}

