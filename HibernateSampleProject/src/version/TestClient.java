package version;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import version.ProductDao;


public class TestClient {
	private static SessionFactory factory;
	
	static{
		Configuration config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();
	}
	static Product pOld=null;
	public static void main(String[] args) throws Exception {
		
		final ProductDao dao=new ProductDao();
		
		new Thread()
		{
			public void run()
			{
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml"); 
		 
				SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();
				Object o=session.load(Product.class,new Integer(104));
				Product pOld=(Product)o;
		 
				Transaction tx = session.beginTransaction();	
		 
				pOld.setPrice(7800); // implicitly update method will be call
		 
				tx.commit();
		 
				System.out.println("Object Updated successfully.....!!");
				session.close();
				factory.close();
			}
		}.start();
		
		
		new Thread()
		{
			public void run()
			{
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml"); 
		 
				SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();
				Object o=session.load(Product.class,new Integer(104));
				Product s=(Product)o;
		 
				Transaction tx = session.beginTransaction();	
		 
				 s.setPrice(6700); // implicitly update method will be call
		 
				tx.commit();
		 
				System.out.println("Object Updated successfully.....!!");
				session.close();
				factory.close();

			}
		}.start();
		
		//System.out.println(pOld.getVersionId());
		
		
		
	}

}
