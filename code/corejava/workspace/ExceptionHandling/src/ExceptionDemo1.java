import java.io.FileReader;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Division : " + (num1/num2)); // ArithmeticException chances (un-checked exception) 
		
		
		scan.close();
		
		
		//FileReader reader = new FileReader("C:\\test.txt"); // checked Exception
		
	}
}
