package com.util;

import java.net.URL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    private static Session currentSession;

    static {
	try {
	    URL url = HibernateUtil.class.getResource("/hibernate.cfg.xml");

	    // CreateSessionFactory
	    sessionFactory = new Configuration().configure(url)
		    .buildSessionFactory();

	} catch (Throwable ex) {
	    System.err.println("Initial SessionFactory creation failed." + ex);
	    ex.printStackTrace();
	    throw new ExceptionInInitializerError(ex);
	}
    }
    /**
     * Get our sessionfactory.
     * 
     * @return SessionFactory
     */
    public static SessionFactory getSessionFactory() {
	return sessionFactory;
    }
}