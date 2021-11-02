<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to Book Store</h1>

<%@ page import="java.util.List,com.training.classes.*" %>
<!--  out request response session exception  -->

<a href="BookServlet?action=logout">logout</a><br><br>


<p>------------------------------------------------</p>
<table border="1">
<%
	List<Book> books = (List<Book>)session.getAttribute("books");
	Customer customer = (Customer)session.getAttribute("customer");
	
	for(Book b:books)
	{
		%>
		<tr>
		<td><%= b.getIsbn() %></td>
		<td><%= b.getTitle() %></td>
		<td><%= b.getPrice() %></td>
		<td><%= b.getStock() %></td>
		<td><%= b.getCategory()%></td>
		<td><a href="">add to cart</a></td>
		</tr>
		
	<% }
%>

</table>
<p id="profile">
<ul>
<li> <%= customer.getName() %> </li>
<li> <%= customer.getEmail() %></li>
<li> <%= customer.getPhone() %></li>
<li><%= customer.getAddressList() %>
</ul>
</p>
</body>
</html>


