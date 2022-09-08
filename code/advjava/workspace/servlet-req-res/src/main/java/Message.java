

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message")
public class Message extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<link rel='stylesheet' href='style.css'/>");
		out.print("<div align='center'>");
			out.print("<h1>User Message Page</h1>");
			out.print("<form action='result'>");
				out.print("Enter Message <input class='msgcls' id='msg' type='text' name='msg'/>");
				out.print("<br/><br/>");
				out.print("<button id='sendbtn' type='submit'>Send</button>");
			out.print("</form>");
		out.print("</div>");
	}

}
