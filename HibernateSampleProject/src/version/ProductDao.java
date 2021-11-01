package version;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import version.Product;

public class ProductDao {
private static SessionFactory factory;
	
	static{
		Configuration config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();
	}
	
	public boolean addProduct(int code,String description,double price,long stock)
	{
		try{
			
			Product p=new Product(code, description, price, stock);
			Session session=factory.openSession();
			session.save(p);
			session.flush();
			session.close();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
		
	}
	
	//retrieve
	
	public Product getProduct(int code)
	{
		Session session=factory.openSession();
		Product product=(Product) session.get(Product.class, code);
		return product;
	}
	
	public  boolean updateProduct(int code,long stock)
	{
		try{
		Session session=factory.openSession();
		Product product=(Product) session.get(Product.class, code);
		
		product.setStock(stock);
		session.flush();
		session.close();
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public boolean deleteProduct(int code)
	{
		try{
		Session session=factory.openSession();
		Product product=(Product) session.get(Product.class, code);
		
		session.delete(product);
		session.flush();
		session.close();
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
	public boolean updateProduct(Product p,long stock)
	{
		try{
			Session session=factory.openSession();
			//System.out.println("here");
			Transaction tx = session.beginTransaction();
			p.setStock(stock);
		
			//session.flush();
			tx.commit();
			session.close();
			return true;
			}
			catch(Exception e)
			{
				System.out.println(e);
				return false;
			}
	}
}






