import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		int arr[] = {12,45,66,0, 4, 2, 1};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1st Index : ");
		int index1 = scan.nextInt(); // 0
		
		System.out.println("2nd Index : ");
		int index2 = scan.nextInt(); //5
		int num1 =0;
		int num2 = 0; 
		
		try {
			num1 = arr[index1]; // 12
			num2 = arr[index2]; // 2
		} 
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("You given a wrong, hence default index is considered...");
			num1 = 1;
			num2 = 1;
		}
		
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		System.out.println("Division : " + (num1/num2));
		
		scan.close();
		System.out.println("End Of the logic");
	}

}
