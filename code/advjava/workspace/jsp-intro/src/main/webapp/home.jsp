<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>

<div align="right">
	<h1>User, <%= request.getParameter("uname") %> </h1>
</div>

<hr>

<div align="center">
	<h1>Welcome User to Home Page</h1>
</div>


</body>
</html>