
public class EmployeeInfo {
	public static void main(String[] args) {
		Employee emp = new Employee();
			
		emp.setName("Abc");
		emp.setId(123);
		emp.setSalary(123123.12);
		emp.setMobNo("9988009988");
		
		System.out.println(emp.getId());
		
		emp.displayDetails();
	}
	
	public static void swap(int a, int b) { //a=10, b=20
		a = a + b; // a = 30
		b = a - b; // b= 10
		a = a - b; // a = 20
	}
	
}

// These classes are also called as DTO(Data Transfer Object), Entity, Bean, Model, Domain 
class Employee {
	private String name;
	private int id;
	private double salary;
	private String mobNo;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	public String getMobNo() {
		return mobNo;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public void setMobNo(String contact) {
		// validation logic for Mobile Number
		mobNo = contact;
	}
	
	public void displayDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Contact : " + mobNo);
	}
}



class Student {
	private String name;
	private String city;
	private String dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}

































