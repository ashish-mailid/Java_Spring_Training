package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		/*out.print("<h3> This is a Hello Servlet</h3>");
		out.print("<h3> This is a second message</h3>");
		
		String email=request.getParameter("email");
		out.print("<h3>Welcome:"+email+"</h3>");*/
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String interests[]=request.getParameterValues("interests");
		out.print(email+"<br>");
		out.print(dob+"<br>");
		out.print(address+"<br>");
		out.print(city+"<br>");
		out.print(Arrays.toString(interests));
		
	}
}




