<%

	String name = request.getParameter("uname");
	String pass = request.getParameter("upass");
	
	
	if("admin".equals(name) && "admin123".equals(pass)) {
		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
	} else {
		response.sendRedirect("login.jsp?c=0");
	}

%>