public class VariableDemo2 {
  public static void main(String args[]) {
	
	byte b = 10;
	int c = b; // Implicit Casting

	System.out.println(b);
	System.out.println(c);


	int x = 130;
	byte y = (byte) x; // Explicit Casting

	System.out.println(x);
	System.out.println(y);

  }
}