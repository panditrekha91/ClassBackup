public class ObjectDemo1
{
	public static void main(String args[])
	{
		Student stud = new Student();
		stud.printStudent();
	}
}

class Student
{
	int id;
	public void printStudent()
	{
		int id = 20;
		System.out.println("Id: "+ id);
		System.out.println("Id: "+ this.id);
	}
}