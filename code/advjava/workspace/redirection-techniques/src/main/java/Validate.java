

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth-user")
public class Validate extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		//DB Code
		if("admin".equals(name) && "admin123".equals(pass))
		{
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);			
		}
		else 
		{
			response.sendRedirect("error");
		}
	}

}
