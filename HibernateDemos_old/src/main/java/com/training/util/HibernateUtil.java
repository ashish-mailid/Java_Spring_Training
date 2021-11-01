package com.training.util;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.training.bean.Product;

public class HibernateUtil {
	
	private HibernateUtil() {}
	
	private static SessionFactory sessionFactory;
	
	
	/*
	 * static { StandardServiceRegistry ssr = new
	 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	 * sessionFactory = meta.getSessionFactoryBuilder().build(); }
	 * 
	 * 
	 * public static SessionFactory getSessionFactory() { return sessionFactory; }
	 */
	  
	
	
	  public static SessionFactory getSessionFactory() { try { Configuration
	  configuration = new Configuration(); StandardServiceRegistry serviceRegistry
	  = new
	  StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
	  .build();
	  //configuration.addAnnotatedClass(Product.class); 
	  
	  return
	  configuration.buildSessionFactory(serviceRegistry); }catch(Exception e) {
	  e.printStackTrace(); throw new
	  RuntimeException("There is issue in hibernate util"); } }
	 
	
	
}
