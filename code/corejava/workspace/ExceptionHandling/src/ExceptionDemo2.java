import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			System.out.println("Enter 1st Number : ");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter 2nd Number : ");
			int num2 = scanner.nextInt();
			
			System.out.println("Add : " + (num1+num2));
			
			try {
				System.out.println("Div : " + (num1/num2));
			} 
			catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			}
			
			System.out.println("Mul : " + (num1*num2));
			System.out.println("Sub : " + (num1-num2));
		
		}
		catch(InputMismatchException | ArithmeticException ex) { // JDK-7 and Onwards 
			 System.err.println("Exception Found. Please try after sometime...");
		}
		/*catch(InputMismatchException ex) {
			//System.out.println(ex.getMessage());
			//System.out.println(ex.getClass());
			System.err.println("Please provide the valid input...");
			//ex.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.err.println("Cannot divide by 0....");
		}*/
		catch(RuntimeException e) {
			System.err.println("Someting went wrong...");
		}
		
		
		try {
			//String statements
		} catch(StringIndexOutOfBoundsException e) {
			
		}
		
		scanner.close();
	}
}
