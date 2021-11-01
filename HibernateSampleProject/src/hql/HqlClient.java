package hql;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import basicexample.com.pojo.Product;

public class HqlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();
	    
	  /*  //update a record
	   Product product=(Product) session.get(Product.class, 2);
	     System.out.println(product);
	    if(product!=null)
	    {
	    	product.setPrice(250);
	    }
	    //session.getTransaction().begin();
	   // session.update(product);
	        
	   // session.getTransaction().commit();
	   // System.out.println(product);
	    //product.setPrice(250);
	   
	   session.close();
	   
	   product.setPrice(800);
	   
	   Session session1=sf.openSession();
	   Product product1=(Product) session1.get(Product.class, 2);
	   
	   session1.getTransaction().begin();
	//  session1.update(product); // throws NonUniqueObjectException
	   session1.merge(product);
	   session1.getTransaction().commit();
	    System.out.println(product1);
	    System.out.println(product);  */
	    
	   /* Query q=session.createQuery("select avg(price) from Product");
	    System.out.println(q.uniqueResult());*/
	    
	    SQLQuery q1=session.createSQLQuery("insert into product(code,name) values(678,'hjh')");
	    session.getTransaction().begin();
	    q1.executeUpdate();
	    session.getTransaction().commit();
	}

}
