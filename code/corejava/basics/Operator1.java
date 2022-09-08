public class Operator1
{
	public static void main(String args[])
	{
		int a = 10;
		double b = 20;


		//=====Arithmetic Operator=============
	
		double add = a + b;
		double sub = a - b;
		double div = a / b;
		double mul = a * b;
		double mod = a % 3;
	
		System.out.println(add); // 30.0
		System.out.println(sub); // -10.0
		System.out.println(div); // 0.5
		System.out.println(mul); // 200.0
		System.out.println(mod); // 1.0


		//=====Assignment Operator=============
		int x = 10;
		int y = 5;
		
		x += y; // x = x + y; 
		System.out.println(x); // 15
		x-=y; // x = x- y
		System.out.println(x); // 10




		byte  m = 10;
		// m = (byte) (m + 1);
		m+=1; // m = m + 1
		System.out.println(m); // 11

		

	}
}












