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
	
		<h1>Page 2 of 3</h1>
		<hr>
	
		<%
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
		
		%>
	
		<form action="preview.jsp">
		
			<input type="hidden" name="name" value="<%=name%>">
			<input type="hidden" name="email" value="<%=email%>">
			<input type="hidden" name="contact" value="<%=contact%>">
			
		
			Enter City : <input type="text" name="city">
			<br><br>
			Enter Pin code : <input type="text" name="pincode">
			<br><br>
			Enter State : <input type="text" name="state">
			<br><br>
			<button type="submit">Preview</button>
		</form>
	</div>

</body>
</html>