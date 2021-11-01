package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.bean.Product;
import com.training.dao.ProductDao;


public class ProductServlet extends HttpServlet {
	
	private HttpSession session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao dao= new ProductDao();
		String action=request.getParameter("action");
		String path="";
		switch(action)
		{
		case "home":
		
		session = request.getSession();
		
		Set<Product> products = dao.getProducts(); 
		path="store2.jsp";
		
		break;
		
		case "delete":
			long code = Long.parseLong(request.getParameter("code"));
			System.out.println("code:"+code);
		//	dao.deleteProduct(code);
			
		path ="store2.jsp";
		//	List<Product> products = dao.getProducts();
			
			break;
			
		case "update":
			// write code here.
			path="store2.jsp";
			break;
			
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
