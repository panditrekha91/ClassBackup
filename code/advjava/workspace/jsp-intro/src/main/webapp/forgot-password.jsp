<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
<div align="center">
		<h1>Forgot Password</h1>
		<form action="auth-user?action=resetpass" method="post">
			Enter User Name : <input type="text" name="uname">
			<br/><br/>
			New Password : <input type="password" name="upass">
			<br/><br/>
			<button type="submit">Change Password</button>
		</form>
		<a href="jsp-intro.jsp">Login</a>  | <a href="register.jsp">Not Yet Register?</a> 
	</div>
</body>
</html>