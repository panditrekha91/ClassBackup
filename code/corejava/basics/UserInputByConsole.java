import java.io.Console;

public class UserInputByConsole
{
	public static void main(String args[])
	{
		Console c = System.console();

		System.out.println("Enter User Name : ");
		String name = c.readLine();

		System.out.println("Enter Password :");
		char ch[] = c.readPassword();
		String pass = new String(ch);

		System.out.println("User Name : " + name);
		System.out.println("Password : "+ pass);
	}
}
