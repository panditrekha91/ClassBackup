

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-intro")
public class ServletIntro extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello This is a First Servlet");
		
		response.setContentType("text/html"); // specify the type of response
		PrintWriter out = response.getWriter(); // create object of printwriter to return response
		out.print("<html>");
		out.print("<head>");
			out.print("<link rel='stylesheet' href='style.css'/>");
		out.print("</head>");
		out.print("<body>");
			out.print("<h1>Welcome To First Servlet Response in HTML</h1>"); // response to the client
			out.print("Enter Message : <input type='text' name='msg'/>");
			out.print("<button type='submit'>Send</button>");
		out.print("</body>");
		out.print("</html>");
	}

}
