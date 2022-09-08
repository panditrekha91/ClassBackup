public class ObjectDemo
{
	public static void main(String args[])
	{
		Employee emp; // reference variable
		emp = new Employee(); // Object of Employee Class

		emp.id = 121;   // call/access the variables using Object
		emp.salary = 34534.43;

		emp.displayEmployee(); // call/access the method using Object
	}
}

class Employee
{
	int id;
	double salary;

	public static void displayEmployee()
	{
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
	}
}