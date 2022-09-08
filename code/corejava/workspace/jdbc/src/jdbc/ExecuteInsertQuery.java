package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("INSERT INTO student VALUES(2, 'Xyz', 'xyz@gmail.com'),(3, 'Pqr', 'pqr@gmail.com'),(4, 'Lmn', 'lmn@gmail.com')");
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. close connection
			con.close();
			System.out.println(count + " : rows affected..");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
