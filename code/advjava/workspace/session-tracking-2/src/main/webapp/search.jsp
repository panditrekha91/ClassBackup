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
		String value = "No Search Details Available..";
		Cookie[] cks =  request.getCookies();
		if(cks != null) {
			for(Cookie ck : cks) {
				if(ck.getName().equals("search")) {
					value = ck.getValue();
					break;
				}
			}
		}
	
	%>
	
	<h3>Previous Search : <%= value.replace("*", " ") %></h3>

	<hr>

	<form action="result">
	
		Search Of : <input type="text" name="query">
		<br><br>
		<button type="submit">Search</button>
	
	</form>
</div>

</body>
</html>