public class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sbr = new StringBuilder("Hello");
		System.out.println(sbr); // Hello

		sbr.append(" Java Program");
		System.out.println(sbr); // Hello Java Program

		sbr.insert(5," StringBuilder");// Hello StringBuilder Java Program
		System.out.println(sbr);

		sbr.reverse(); 
		System.out.println(sbr);
	}
}