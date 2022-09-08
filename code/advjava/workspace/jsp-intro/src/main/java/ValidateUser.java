

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth-user")
public class ValidateUser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		System.out.println("Action : " + action);
		
		
		if("login".equals(action)) {
			String user = request.getParameter("uname");
			String pass = request.getParameter("upass");
			boolean isValidUser = false;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root");
				PreparedStatement stmt = con.prepareStatement("Select * from employee where email=? and password=?");
				stmt.setString(1, user);
				stmt.setString(2, pass);
				
				ResultSet rs = stmt.executeQuery();
				isValidUser = rs.next();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			if(isValidUser) {
				// Home.jsp
				RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
				dis.forward(request, response);
			}
			else {
				// Error.jsp
				response.sendRedirect("error.jsp");
			}
		}
		
		else if("resetpass".equals(action)) {
			
			
		}
		
		
	}

}
