<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store</title>
<style>
#products {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#products td, #products th {
  border: 1px solid #ddd;
  padding: 8px;
}

#products tr:nth-child(even){background-color: #f2f2f2;}

#products tr:hover {background-color: #ddd;}

#products th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>

<body>

<form>
<input type="text" name="" placeholder="Enter the product name pattern to search"/> &nbsp;&nbsp;
<input type="button" name ="action" value="search" />

</form>
<br><br>
<table id="products">
<c:forEach var="p" items="${products}">
<tr>
	<td>${p.code} </td>
	<td>${p.name} </td>
	
	<td><a href="PC?action=delete&code=${p.code}">delete</a></td>
	<td><a href="updateform.jsp">update</a> </td>
	
</tr>
</c:forEach>

</table>


</body>
</html>