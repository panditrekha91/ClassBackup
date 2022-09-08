

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init function from the servlet");
		// Create DB Connection Object
	}

	public void destroy() {
		System.out.println("Destory function from the servlet");
		// destory the Db Connection Object
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service function from the servlet");
		// Use Db Connection Object
	}

}