package com.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.bean.Product;
import com.training.util.HibernateUtil;

import jakarta.persistence.Query;

public class ProductDao {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory= HibernateUtil.getSessionFactory();
		if(sessionFactory!=null)
			System.out.println("Connection Successful");
	}
	
	public boolean addProduct(Product p1)
	{
		try {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.save(p1);
		tx.commit(); return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	public Product searchProduct(long code)
	{
		Session session = sessionFactory.openSession();
		return session.load(Product.class, code);
	}

	public List<Product> getProducts() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		
		return query.getResultList();
	}

	public List<Product> getProductsByNamePattern(String namePattern) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product as p where p.name like ?1");
		query.setParameter(1, "%"+namePattern+"%");
		List<Product> products = query.getResultList();
		session.close();
		return products;
	}

	// get products that are stocked less than 100
	
	public List<Product> getProductsByStock(long stock) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product as p where p.stock < ?1 order by name");
		// select * from product1 where stock < ? order by name   in jdbc
		query.setParameter(1, stock);
		List<Product> products = query.getResultList();
		session.close();
		return products;
	}
	
	//add stock of the products by 50 whose stock is less than 100
	
	public int updateStockByStock(long stock,long newStock)
	{
		try {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Query query = session.createQuery("update Product as p set p.stock = p.stock + ?1 where p.stock < ?2");
		query.setParameter(1, newStock);
		query.setParameter(2, stock);
		int n= query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return n;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	
}








