package onetomany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client1 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();  
	    Transaction tx=session.beginTransaction();  
	      
	    tx = session.beginTransaction();
	    System.out.println("Create Customer and complaints");
	    Customer c = new Customer();
	    c.setFirstName("Vivek");
	    c.setLastName("Bose");
	    c.setEmail("vivek@yahoo.com");

	    Map<Integer,Complaint> cm=new HashMap<>();
	    cm.put(1001,new Complaint("Internet not working "));
	    cm.put(1002,new Complaint("Service delays"));

	    c.setComplaints(cm);

	    Customer c1 = new Customer();
	    c1.setFirstName("Sam");
	    c1.setLastName("Smith");
	    c1.setEmail("sam@yahoo.com");

	    Map<Integer,Complaint> cm1=new HashMap<>();
	    cm1.put(1003,new Complaint("Modem  not working "));
	    cm1.put(1004,new Complaint("Payment discrepancy"));

	    c1.setComplaints(cm1);
	    session.save(c1);
	    session.save(c);
	    tx.commit();
	    
	    Query q=session.createQuery("from Customer");
	    List<Customer> cList=q.list();
	    for(Customer ct:cList)
	    {
	    	System.out.println(ct);
	    	
	    }
	    
}
}
