package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.classes.Customer;
import com.training.classes.User;
import com.training.dao.LoginDao;


public class HelloServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * PrintWriter out = response.getWriter();
		 * out.print("Hello Servlet! This is a GET Request<br>");
		 * 
		 * String username = request.getParameter("username"); 
		 * String password =
		 * request.getParameter("password");
		 * 
		 * out.print("<h2>Welcome "+username+" "+password+"</h2>");
		 */
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hello Servlet! This is a Post Request<br>");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		LoginDao loginDao = new LoginDao();
		User user = loginDao.validate(username, password);
		{
			if(user!=null && user instanceof Customer)
			{
				Customer customer = (Customer)user;
				System.out.println(customer);
			}
			

		}
	
		
	}

}
