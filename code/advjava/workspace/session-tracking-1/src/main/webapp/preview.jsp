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

<%

	String name = request.getParameter("name");
	String contact = request.getParameter("contact");
	String email = request.getParameter("email");

	String city = request.getParameter("city");
	String pin = request.getParameter("pincode");
	String state = request.getParameter("state");
%>

	
		<h1>Page 3 of 3</h1>
		<hr>
	
		<h3>Name : <%= name %> </h3>
		<h3>Email : <%= email %> </h3>
		<h3>Contact : <%= contact %> </h3>
		<h3>City : <%= city %></h3>
		<h3>Pincode : <%= pin %></h3>
		<h3>State : <%= state %></h3>
		
		
		<h1> <a href="savedata?name=<%=name%>&contact=<%=contact%>&email=<%=email%>&city=<%=city%>&pin=<%=pin%>&state=<%=state%>"> Save </a> </h1>
		
	</div>
</body>
</html>










