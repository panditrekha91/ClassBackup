public class Array1D
{
	public static void main(String[] args)
	{
		int marks[]; // Declaration of Array
		marks = new int[5]; // instance creation of Array

		marks[1] = 60;
		marks[2] = 70;
		marks[4] = 80;

		System.out.println(marks[0]); // 0
		System.out.println(marks[1]); // 60
		System.out.println(marks[2]); // 70
		System.out.println(marks[3]); // 0
		System.out.println(marks[4]); // 80
		System.out.println("=======================");
		for(int i=0 ; i<=4 ; i++) {
			System.out.println(marks[i]);
		}
		
	}
}