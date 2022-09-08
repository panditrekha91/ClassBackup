import java.util.Scanner;
public class InputByScanner
{
	public static void main(String args[])
	{


		Scanner scan = new Scanner(System.in);

		String names[] = new String[5];

		for(int i = 0 ; i<=4; i++) {
			System.out.println("Enter Your Name : ");
			names[i] = scan.next();
		}

		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();

		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();


		for(int i = 0 ; i<=4; i++) {
			System.out.println("Hello User, " +names[i]);
		}
		
		System.out.println("Add : " + (num1 + num2));

		scan.close();
	}
}