import java.time.LocalDate;
import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Birth Year");
		int birthYear = scan.nextInt();
		
		int currentYear = LocalDate.now().getYear();
		
		int age = currentYear - birthYear;
		
		try {
			// age is not in 20-35 then throw an exception.
			if(!(age>=20 && age<=35)) {
				throw new AgeInvalidException();
			}
		} catch(AgeInvalidException ex) {
			ex.showError();
		} finally {
			scan.close();
		}	
		System.out.println("Your are : " + age + " years old");
		
	}

}
