
public class Printer {

	//public synchronized void print(int number) {
	public void print(int number) {
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number*i));
		}
	}
	
	
}
