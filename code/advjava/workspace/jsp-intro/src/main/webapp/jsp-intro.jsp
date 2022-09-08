<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>User Login</h1>
		<form action="auth-user?action=login" method="post">
			Enter User Name : <input type="text" name="uname">
			<br/><br/>
			Enter Password : <input type="password" name="upass">
			<br/><br/>
			<button type="submit">Sign-In</button>
		</form>
		<a href="forgot-password.jsp">Forgot Password?</a>  | <a href="register.jsp">Not Yet Register?</a> 
	</div>
</body>
</html>