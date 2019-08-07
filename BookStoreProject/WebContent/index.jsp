<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="CartServlet?action=viewcart">View Cart</a> <br><br> 
 <a href="CartServlet?action=logout">LogOut</a>

<form action="CartServlet" method="get">
<select name="item">
	<option>nuts</option>
	<option>chocolates</option>
	<option>cookies</option>
	<option>Nachos</option>
</select>
	<input type="submit" name="action" value="add"/>
</form>

</body>
</html>