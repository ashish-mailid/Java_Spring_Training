<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles.css"/> 

</head>
<body>
<h2> Welcome Home..</h2> <br/>
<%@ page import="com.store.classes.User,com.store.classes.Book,java.util.List" %>
<%
	User user = (User)request.getAttribute("user");
%>
<h2>Here is the Book Store ..<%= user.getEmail()%></h2>
<hr/>
<%
	List<Book> bookList = (List<Book>)request.getAttribute("bookList");
%>
<table>

<% for(Book book:bookList){ %>
<tr>
<td><%= book.getIsbn() %></td>
<td><%= book.getTitle() %></td>
<td><%= book.getAuthor() %></td>
<td><%= book.getPrice() %></td>
<td><%= book.getStock() %></td>
<td>
<% if(user.getRole().equalsIgnoreCase("admin")){ %>
<input type="submit" value="delete"/>
<%}else{%>
<input type="submit" value="addtocart"/>
<%} %>
</td>
</tr>

<%} %>

</table>




</body>
</html>