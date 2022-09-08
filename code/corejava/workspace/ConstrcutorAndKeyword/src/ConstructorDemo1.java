
public class ConstructorDemo1 {
	public static void main(String[] args) {
		System.out.println("Employee 1");
		Employee e1 = new Employee();
		e1.printDetails();
		
		System.out.println("Employee 2");
		Employee e2 = new Employee();
		e2.printDetails();
		
		System.out.println("Employee 3");
		Employee e3 = new Employee(111, "Abcd", 345345.43);
		e3.printDetails();
	}
}
class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee() { // no-Parameterized constructor 	
		id=0;
		name="NA";
		salary=1000;
	}
	
	public Employee(int i, String nm, double sal) { // 3 Parameterized constructor
		id = i;
		name = nm;
		salary = sal;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void printDetails() {
		System.out.println("Id : " + id); // 0
		System.out.println("Name : " + name); // null
		System.out.println("Salary : " + salary); // 0.0
	}
}
