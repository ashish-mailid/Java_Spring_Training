package basicexample.com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import basicexample.com.pojo.Product;

public class ProductDao {
	
	SessionFactory sessionFactory;
	Configuration conf=new Configuration();
	{
	conf.configure("hibernate.cfg.xml");
	sessionFactory = conf.buildSessionFactory();
	}
	public List<Product> getAllProducts()
	{
		
		Session session=sessionFactory.openSession();
		Query q=session.createQuery("From Product");
		return q.list();
	}
	
	public boolean deleteProduct(int code)
	{
		Session session=sessionFactory.openSession();
		Product delProd=(Product) session.get(Product.class, code);
		Transaction tx=session.beginTransaction();
		session.delete(delProd);
		tx.commit();
	//	session.flush();
		return true;
		
	}
	
	public boolean addProduct(Product pnew)
	{
		try{
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		//session.persist(pnew);
		session.saveOrUpdate(pnew);
		tx.commit();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDao p=new ProductDao();
		System.out.println(p.getAllProducts());
		
		
		
	}

}
