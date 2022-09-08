package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.dto.Task;
import todo.model.TaskModel;

@WebServlet("/create-new-task")
public class NewTaskController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String desc= request.getParameter("desc");
		String date= request.getParameter("scheduledon");
		String status= request.getParameter("status");
		
		Task task = new Task(); 
			task.setTitle(title);
			task.setTaskdesc(desc);
			task.setTaskdate(date);
			task.setStatus(status);

		TaskModel model = new TaskModel();
		boolean flag = model.save(task);
		
		if(flag) {
			response.sendRedirect("new-task.jsp?c=200");
		} else {
			response.sendRedirect("new-task.jsp?c=500");
		}
			
	}

}
