package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExecuteSelectQuery {

	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM student");
			// 4. Execute Statement
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("email") + "\n");
			}
			
			// 5. close connection
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
