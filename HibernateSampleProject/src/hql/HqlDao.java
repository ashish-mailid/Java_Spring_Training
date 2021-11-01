package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import basicexample.com.pojo.Product;

public class HqlDao {
	SessionFactory sessionFactory;
	Configuration conf=new Configuration();
	{
	conf.configure("hibernate.cfg.xml");
	sessionFactory = conf.buildSessionFactory();
	}
	
	/* get all the products which are priced above specified price  */
	
	public List<Product> getProductsPrice(double price)
	{
		Session session=sessionFactory.openSession();
		//Query query=session.createQuery("From Product p where p.price > ?");
		//query.setParameter(0, price);
		Query query=session.createQuery("From Product p where p.price > :price");
		query.setParameter("price", price);
		return query.list();
	
	}
	
	/* update stock of all products whose name has a pattern */
	public boolean updateStockName(long stock,String namePattern)
	{
		try{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("update Product p set p.stock=? where p.name like ?");
		query.setParameter(0,stock);
		query.setParameter(1, "%"+namePattern+"%");
		query.executeUpdate();
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
	
}
