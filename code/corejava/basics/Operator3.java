public class Operator3
{
	public static void main(String args[])
	{
		int a = 110;
		int b = 110;
		//boolean result = a > b;
		System.out.println(a > b);  // false
		System.out.println(a >= b); // true

		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false

		int x = 10;
		int y = 5;
		System.out.println(x & y); // 0
		System.out.println(x | y); // 15
		System.out.println(true & false); // false
		System.out.println(true | false); // true

		System.out.println((a >= 5) & (a <= 15)); // false
		
	}
}