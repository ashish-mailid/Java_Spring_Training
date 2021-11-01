package com.training.classes;

import org.hibernate.SessionFactory;

import com.training.util.HibernateUtil;


public class LoginDao {
	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	public boolean validateUser(String username,String password)
	{
		return true;
	}

	public static void main(String[] args) {
		LoginDao loginDao=new LoginDao();
		
	}
}
