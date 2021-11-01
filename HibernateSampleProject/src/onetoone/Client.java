package onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();  
	    Transaction tx=session.beginTransaction();  
	      
	    Employee e1=new Employee();  
	    e1.setName("sam");  
	    e1.setEmail("sam@gmail.com");  
	      
	    Address address1=new Address();  
	    address1.setAddressLine1("G-21,Lohia nagar");  
	    address1.setCity("Ghaziabad");  
	    address1.setState("UP");  
	    address1.setCountry("India");  
	    address1.setPincode(201301);  
	      
	      
	    e1.setAddress(address1);  
	    address1.setEmployee(e1);  
	      
	    session.persist(e1);  
	    tx.commit();  
	      
	    List<Employee> empList=session.createQuery("from Employee").list();
	    for(Employee e:empList)
	    {
	    	System.out.println(e.getName()+" "+e.getAddress().getAddressLine1());
	    }
	    
	  
	    

	}

}
