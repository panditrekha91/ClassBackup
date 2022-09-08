// java CommandLineArg 23 34

public class CommandLineArg
{
	public static void main(String args[])
	{
		System.out.println("Command Line Argument...");
		System.out.println("Num1 : " + args[0]);
		System.out.println("Num2 : " + args[1]);
		int n1 = Integer.parseInt(args[0]); // this method is use to convert string into int
		int n2 = Integer.parseInt(args[1]);
		System.out.println("Add : " + (n1+n2));				
	}
}