<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

<div align="center">
	<h3>User Login</h3>
	
	<%
		String msg="";
		String color="";
		
		String code = request.getParameter("c");
		if(code != null) {
			switch(code) {
				case "401" :
					msg="Invalid UserName or Password..";
					color="red";
					break;
				case "202" :
					msg="You have been successfully Logged out..";
					color="green";
					break;
				case "408" :
					msg="Your session has been expired. Please login Again..";
					color="red";
					break;
			}
		}
	
	%>
	
	<h4 style="color: <%=color%>"> <%= msg %></h4>
	
	<form action="auth-user">
		Enter User Name <input type="text" name="name">
		<br><br>
		Enter Password <input type="text" name="pass">
		<br><br>
		<button type="submit">Login</button>
	
	</form>

</div>

</body>
</html>