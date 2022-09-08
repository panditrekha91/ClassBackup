package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Register Driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root"); // DB Connection
			
			System.out.println("Connection Success...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
