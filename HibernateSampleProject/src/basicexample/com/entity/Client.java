package basicexample.com.entity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration; 

public class Client {
	public static void main(String[] args) {
		AnnotationConfiguration configuration=new AnnotationConfiguration();  
		configuration.configure("hibernate.cfg.xml");  
		SessionFactory sFactory=configuration.buildSessionFactory();  
		Session session=sFactory.openSession();  

		//Hibernate Named Query  
		Query query = session.getNamedQuery("findProductByName");  
		query.setString("name", "nuts");  
		
		//Query query=session.createQuery("from Product");

		List<Product> products=query.list();  
System.out.println(products);
		/*Iterator<Product> itr=products.iterator();  
		while(itr.hasNext()){  
			Product e=itr.next();  
			System.out.println(e);  
		} */ 

		System.out.println("here");
		session.close();  
	}

}
