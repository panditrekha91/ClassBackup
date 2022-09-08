

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String value = request.getParameter("query");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1> You are searching for : "+value+" </h1>");
		
		// create a cookie
		Cookie ck = new Cookie("search", value.replace(" ", "*")); 
		//set the expire time for cookie in seconds 
		ck.setMaxAge(7*24*60*60);
		// send cookie to client side
		response.addCookie(ck);
		
		
		
		
	}

}
