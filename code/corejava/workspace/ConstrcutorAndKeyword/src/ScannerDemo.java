import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("int : ");
		int a = scan.nextInt();
		
		System.out.println("double : ");
		double d = scan.nextDouble();
		
		System.out.println("String : ");
		scan.nextLine();
		String s = scan.nextLine();
		
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		
		scan.close();
	}

}
