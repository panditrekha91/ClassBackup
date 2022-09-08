

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/auth-user")
public class AuthenticateUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		if("Admin".equals(username) && "Admin123".equals(password)) {
			// to create a new session or to get existing session if already available
			HttpSession session = request.getSession();
			// store value inside session
			session.setAttribute("uname", username);
			response.sendRedirect("home.jsp");
			
		} else {
			response.sendRedirect("login.jsp?c=401");
		}
	}

}
