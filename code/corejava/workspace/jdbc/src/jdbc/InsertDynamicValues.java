package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicValues {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Email : ");
		String email = scan.next();
		scan.close();
		
		//insertData(id, name, email);
		updateData(id, name, email);
		
		
	}
	
	
	public static void insertData(int id, String name, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root");
			PreparedStatement stmt = co.prepareStatement("INSERT INTO student values(?, ?, ?)"); // parameterized query
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, email);
			int count = stmt.executeUpdate();
			co.close();
			System.out.println("rows inserted : " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void updateData(int id, String name, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd28feb","root","root");
			PreparedStatement stmt = co.prepareStatement("UPDATE student SET name=?, email=? where id=?"); // parameterized query
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setInt(3, id);
			int count = stmt.executeUpdate();
			co.close();
			System.out.println("rows Updated : " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












