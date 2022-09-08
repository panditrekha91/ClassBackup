<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>

<style type="text/css">
	#errorMsg {
		color: red;
	}
</style>

</head>
<body>

	<div align="center">
		<h2>User Sign-in page</h2>
		
		<%
			String msg = "";
			String code = request.getParameter("c");
			if(code != null && "0".equals(code)) {
				msg = "Invalid User Name or password";
			}
		%>
		<div id="errorMsg">
			<h3><%=msg%></h3>
		</div>
		
		<form action="validate-user.jsp">
			Enter User Name : <input type="text" name="uname" id="unm">
			<br/><br/>
			Enter Password : <input type="password" name="upass" id="upass">
			<br/><br/>
			<button type="submit">Login</button>
		</form>
	</div>


</body>
</html>