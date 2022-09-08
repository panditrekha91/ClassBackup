public class Calculation
{
	public static void main(String args[])
	{
		System.out.println("Start of Main Method");
			
		Calculation cal = new Calculation();
		
		cal.add(); // calling add method using class Object
		cal.sub(12, 6);

		System.out.println("End of Main Method");
	}

	// add
	public void add()
	{
		int a = 10;
		int b = 30;
		System.out.println("Add : " + (a+b));
	}
	
	// sub: create a method which input 2 int number and print the sub of 2 number
	public void sub(int a , int b)
	{
		int ans = a - b;
		System.out.println("Sub : " + ans);
	} 
		

	// mul: Create a method to perform mul of 2 number and return the result from the method
	public int mul()
	{
		int a = 20;
		int b = 5;
		int ans = a * b;
		return ans;
	}
	// div: Create a method to accept 2 int numbers and return the div of numbers
	public double div(double x , double y)
	{	
		double ans = x / y;
		return ans;
	}
}










