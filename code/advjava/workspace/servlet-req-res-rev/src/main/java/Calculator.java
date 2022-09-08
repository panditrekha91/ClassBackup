

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		
		out.print("<h1>Basic Calculator</h1>");
		out.print("<form action='operation'>");
			out.print("Enter 1st Number : <input type='text' name='num1'>");
			out.print("<br/><br/>");
			out.print("Enter 2nd Number : <input type='text' name='num2'>");
			out.print("<br/><br/>");
			out.print("Select Operation : <select name='opt'>");
				out.print("<option value='+'>+</option>");
				out.print("<option value='/'>/</option>");
				out.print("<option value='-'>-</option>");
				out.print("<option value='*'>*</option>");
			out.print("</select>");
			out.print("<br/><br/>");
			out.print("<button type='submit'>Calculate</button>");
		out.print("</form>");
		out.print("</div>");
	}

}
