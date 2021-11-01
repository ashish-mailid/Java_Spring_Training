package secondlevel;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchTest {
public static void main(String[] args) throws InterruptedException {
Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
	
	Session session1=factory.openSession();
	Employee emp1=(Employee)session1.load(Employee.class,1);
	System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());
	session1.close();
	
	Thread.sleep(5000);
	Session session2=factory.openSession();
	Employee emp2=(Employee)session2.load(Employee.class,1);
	System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());
	session2.close();
	
	/*Session session3=factory.openSession();
	Query q1=session3.createQuery("from Employee e where e.name='rahul'");
	//q1.setCacheable(true);
	System.out.println(q1.list());
	
	 q1=session3.createQuery("from Employee e where e.name='rahul'");
	// q1.setCacheable(true);
	System.out.println(q1.list());
	*/
}
}
