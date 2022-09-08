<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<%
	String name = (String) session.getAttribute("uname");

	if(name == null) {
		response.sendRedirect("login.jsp?c=408");
	}
%>


<div align="right">
<h1>User, <%= name %></h1>
<h3> <a href="logout">Sign out</a> </h3>

</div>


<h1>Welcome To Home Page</h1>

</body>
</html>