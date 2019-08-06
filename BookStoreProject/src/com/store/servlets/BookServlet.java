package com.store.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.classes.User;
import com.store.classes.UserDao;
import com.store.db.DbConnection;
import com.store.interfaces.UserDaoI;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	
	private int count;
	public void init(ServletConfig config) throws ServletException {
		/*count=20;
		System.out.println("Count Initialized..");*/
		/*String jdbcDriver = config.getInitParameter("jdbcdriver");
		System.out.println("Driver :"+jdbcDriver);*/
		
		
		String jdbcDriver=config.getServletContext().getInitParameter("jdbcdriver");
		String dbUrl=config.getServletContext().getInitParameter("dburl");
		String username=config.getServletContext().getInitParameter("username");
		String password=config.getServletContext().getInitParameter("password");
		//System.out.println("Driver :"+jdbcDriver);
		
		DbConnection dbConnection = new DbConnection(jdbcDriver, dbUrl, username, password);

	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("I am in  Book Servlet..");
		String email=request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDaoI userDao=new UserDao();
		User user = userDao.validateUser(email, password);
		
		String path="";
		if(user==null)
			path="login.html";
				
		else if(user.getRole().equalsIgnoreCase("admin"))
			path="adminhome.html";
		else if(user.getRole().equalsIgnoreCase("customer"))
			path="customerhome.html";
		
		
		RequestDispatcher rsp=request.getRequestDispatcher(path);
		rsp.forward(request, response);
			
		
		//List<String> names=Arrays.asList("sam","peter","john");
		
		//RequestDispatcher rsp=request.getRequestDispatcher("second");
		
		//request.setAttribute("n1", names); // String,Object
		
		//rsp.forward(request, response);
		
		//rsp.include(request, response);
		
		//out.print("I am back to BookServlet..");
		
		//response.sendRedirect("http://www.w3schools.com");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}








