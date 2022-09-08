

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/operation")
public class Operation extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String choice = request.getParameter("opt");
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double ans = 0;
		
		switch(choice) {
			case "+":
				ans = n1 + n2;
				break;
			case "-":
				ans = n1 - n2;
				break;
			case "*":
				ans = n1 * n2;
				break;
			case "/":
				ans = n1 / n2;
				break;
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1> "+num1+"  "+choice+" "+num2+" = "+ans+"</h1>");
			out.print("<h3> | <a href='calculator'> Back </a> | </h3>");
		out.print("</div>");
	}

}





