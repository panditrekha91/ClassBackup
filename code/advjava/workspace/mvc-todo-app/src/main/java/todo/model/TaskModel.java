package todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import todo.dto.Task;

public class TaskModel {

	public boolean save(Task task) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb", "root", "root");
			PreparedStatement stmt = con.prepareStatement("insert into task values(0,?,?,?,?)");
			stmt.setString(1, task.getTitle());
			stmt.setString(2, task.getTaskdesc());
			stmt.setString(3, task.getTaskdate());
			stmt.setString(4, task.getStatus());
			int count = stmt.executeUpdate();
			result = count > 0;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public List<Task> getAll() {
		ArrayList<Task> list = new ArrayList<Task>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb", "root", "root");
			PreparedStatement stmt = con.prepareStatement("select * from task");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Task t = new Task();
				t.setId(rs.getInt("id"));
				t.setTitle(rs.getString("title"));
				t.setTaskdesc(rs.getString("taskdesc"));
				t.setTaskdate(rs.getString("taskdate"));
				t.setStatus(rs.getString("status"));
				list.add(t);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
}
























