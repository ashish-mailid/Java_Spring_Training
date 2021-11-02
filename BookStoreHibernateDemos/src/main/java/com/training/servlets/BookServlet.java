package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.classes.Book;
import com.training.classes.BookDao;
import com.training.classes.Customer;
import com.training.classes.LoginDao;

//@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	HttpSession session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action"); // login
		String path ="";
		switch(action)
		{
		case "login":
		
		String username = request.getParameter("username");
		String password=request.getParameter("password");
		
		
		LoginDao loginDao = new LoginDao();
		Customer customer  = loginDao.validateUser(username, password);
		PrintWriter out = response.getWriter();
		
		if(customer!=null) // user is authenticated
		{
			BookDao bookDao = new BookDao();
			List<Book> books = bookDao.getAllBooks();
			session = request.getSession();
			session.setAttribute("customer", customer);
			session.setAttribute("books", books);
			path="store.jsp";
		}
		break;
		
		case "logout":
			path="login.html";
			session.invalidate();
			
			break;
			
		case "forgot":
			path="forgot.jsp";
			break;
			
		}// end switch
		
		request.getRequestDispatcher(path).forward(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
