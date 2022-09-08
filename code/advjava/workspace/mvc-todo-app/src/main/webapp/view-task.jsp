<%@page import="todo.dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>


<div align="center">
	<h2>All Task</h2>
	
	
	<table border="2">
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Scheduled Date</th>
				<th>Status</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			
			<%
			
				List<Task> list = (List<Task>) request.getAttribute("tasks");
				for(Task t : list) {
					
					%>
					<tr>
						<td><%= t.getTitle() %></td>
						<td><%= t.getTaskdesc() %></td>
						<td><%= t.getTaskdate() %></td>
						<td><%= t.getStatus() %></td>
						<td>
							<a href="#?id<%=t.getId()%>">Edit</a> /
							<a href="#?id<%=t.getId()%>">Delete</a>
						</td>
					
					</tr>
					
					<%
					
				}
			%>
			
		</tbody>
	
	</table>
	
	
	
	
	
	
	
</div>



</body>
</html>