public class StringFunction1
{
	public static void main(String args[])
	{
		String s1 = "Morning";
		System.out.println(s1);
		String s2 = s1.toUpperCase(); // MORNING
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());

		String s3 = "          ";
		System.out.println(s3);
		System.out.println(s3.trim().isEmpty());
		System.out.println(s3.isBlank()); // Java-11

		System.out.println("=================");	
		
		String s4 = new String("Java");
		System.out.println(s4); // Java
		char ch[] = s4.toCharArray(); // to convert string into array of char
		
		for(int index = ch.length-1 ; index >= 0 ; index--) {
			System.out.print(ch[index]);
		}
		System.out.println();

		System.out.println("=================");
		String s5 = new String("String");
		System.out.println(s5); // String
		System.out.println(s5.concat(" Program")); // String Program
		System.out.println(s5 + " in Java"); // String in Java

		System.out.println("=================");
		int a = 10;
		int b = 20;
		System.out.println("add : " + a + b); // add : 1020
		
	}
}