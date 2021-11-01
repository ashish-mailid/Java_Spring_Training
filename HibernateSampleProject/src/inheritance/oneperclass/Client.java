package inheritance.oneperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();
	    
	    session.getTransaction().begin();
	    Person p1=new Person("sam", "Mr");
	    Student s1=new Student("Peter", "Mr", 'A');
	    SeniorCitizen sc=new SeniorCitizen("John", "Mrs", 70);
	    
	    session.save(p1);
	    session.save(s1);
	    session.save(sc);
	    
	    session.getTransaction().commit();
	    
	}

}
