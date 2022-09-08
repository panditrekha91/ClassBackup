public class StringDemo1
{
	public static void main(String arr[])
	{
		String str1 = new String("Welcome");
		String str4 = new String("Welcome");
		String str2 = "Welcome";
		String str3 = "Welcome";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println(str1 == str2); // false
		System.out.println(str3 == str2); // true
		System.out.println(str1 == str4); // false
		System.out.println(str4 == str3);
		System.out.println(str3 == "Welcome");
		System.out.println("Hello");
		System.out.println("============================");
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3));
		System.out.println(str1.equals(str3));
	}
}