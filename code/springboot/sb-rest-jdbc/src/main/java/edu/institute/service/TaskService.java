package edu.institute.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import edu.institute.bean.Task;

@Service
public class TaskService {
	
	@Autowired
	private JdbcTemplate temp; 
	
	public boolean save(Task task) {
		Object[] data = {task.getTitle(),  task.getTaskdesc(), task.getTaskdate(), task.getStatus()};
		int count = temp.update("insert into task values(0,?,?,?,?)", data);
		System.out.println(count + " : Rows Inserted....");
		return count>0;
	}
	
	public List<Task> getAllTask() {
		return temp.query("select * from task", new BeanPropertyRowMapper(Task.class));
		
		/*// If Field name differnt than the Column name
		temp.query("", new ResultSetExtractor<Task>() {

			@Override
			public Task extractData(ResultSet rs) throws SQLException, DataAccessException {
				Task t = new Task();
				t.setId(rs.getInt("id"));
				t.setTitle(rs.getString("title"));
				t.setTaskdesc(rs.getString("taskdesc"));
				t.setTaskdate(rs.getString("taskdate"));
				t.setStatus(rs.getString("status"));
				return t;
			}});
		*/
		
	}
	
	public List<Task> getTaskByStatus(String status) {
		Object[] data = {status};
		return temp.query("select * from task where status=?",new BeanPropertyRowMapper(Task.class), data);
	}
	
	
	public List<Task> getTaskById(int id) {
		Object[] data = {id};
		return temp.query("select * from task where id=?",new BeanPropertyRowMapper(Task.class), data);
	}
	
	
	public List<Task> getTaskByTitle(String title) {
		Object[] data = {"%"+title+"%"};
		return temp.query("select * from task where title  like ?",new BeanPropertyRowMapper(Task.class), data);
	}
	
	
	public boolean deleteTask(int id) {
		Object[] data = {id};
		temp.update("delete from task where id=?", data);
		return true;
	}
	
	
	public boolean updateTask(Task task) {
		Object[] data = {task.getTitle(), task.getTaskdesc(), task.getTaskdate(), task.getStatus(), task.getId()};
		temp.update("update task set title=?, taskdesc=?, taskdate=?, status=? where id=?", data);
		return true;
	}

	
}








