<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.training.bean.*,java.util.*" %>



<% List<Product> products = (List<Product>)session.getAttribute("products"); %>

<ul type="disc">
<%
for(Product p:products)
{%>
	<li><%= p.getCode() %>&nbsp;<%= p.getName() %>&nbsp;<%= p.getPrice() %>&nbsp;<%= p.getStock() %>
	
	<a href="">delete</a>&nbsp;<a href="">update</a>
	</li>
<%}
%>

</ul>
</body>
</html>