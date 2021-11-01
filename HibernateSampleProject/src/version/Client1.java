package version;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product p=new Product(); 
 
        p.setCode(108);
        p.setName("cashew nuts");
        p.setPrice(14000);
        p.setStock(0);
 
        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();

	}

}
