public class Operator2
{
	public static void main(String args[])
	{
		int a = 10;
		a = a + 1;
		a += 1; // a = a + 1
		a++;    // a = a + 1
		System.out.println(a); // 13

		int b = 10;
		b--;
		System.out.println(b); // 9


		int c = 5;
		int x = ++c;
		System.out.println(x); // 6
		System.out.println(c); // 6


		int d = 12;
		int y = --d;
		System.out.println(d); // 11
		System.out.println(y); // 11


		int p =10;
		int q = ++p + 5;
		System.out.println(q); // 16


		char ch = 'a';
		ch++;
		System.out.println(ch); // b
		
	}
}