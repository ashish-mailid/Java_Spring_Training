package com.store.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CartServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		String path="";
		HttpSession session=null;
		switch(action)
		{
		case "login":
			session = request.getSession();
			String username=request.getParameter("email");
			String password=request.getParameter("password");
			if(username.equals("sam") && password.equals("sam123")){
				path="index.jsp";
				session.setAttribute("username", username);
			}
			else
				path="login.jsp";
			break;

		case "add":
			List<String> cart=null;

			String item=request.getParameter("item");


			//System.out.println(cart);
			
			System.out.println("Session Id.."+session.getId());

			cart = (List<String>) session.getAttribute("cart");

			if(cart==null)
				cart=new ArrayList<>();

			cart.add(item);
			session.setAttribute("cart",cart);
			path="index.jsp";
			break;

		case "logout":
				session =  request.getSession();
				if(session!=null)
					session.invalidate();
				path="login1.jsp";
				
			break;

		case "viewcart":
			path="cart.jsp";
			break;

		}
		request.getRequestDispatcher(path).forward(request, response);




		//System.out.println(new Date(session.getCreationTime()));



	}

}






