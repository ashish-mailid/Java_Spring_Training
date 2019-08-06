<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%@include file="header.jsp" %>  <%-- file gets included during translation --%>
		<jsp:include page="header.jsp" /> <%-- file gets included during compilation --%>
		
		<%@page import="java.util.Date" %> <%-- directive --%>

			<h1>This is a JSP Demo Page</h1>
			<% Date today = new Date(); %>  <%-- Scriptlet tag --%>
			
			<h3>Today is: <%= today %>      </h3> <%-- expression tag --%>
			
			<%int x=0; %>
			<div style='text-align:center;font-size:20px'>x=<%=++x %> </div>
			
			<%! int y=0; %>
			<div style='text-align:center;font-size: 20px'>y=<%= ++y %></div>
			
			<%-- method to return a reversed String --%>
			
			<%! String reverseString(String inputString)
			{
				StringBuffer sb=new StringBuffer(inputString);
				return sb.reverse().toString();

			} %>
			<%= "The reversed String = "+reverseString(request.getParameter("input")) %>
			
</body>
</html>