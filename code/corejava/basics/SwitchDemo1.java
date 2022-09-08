/*
	create a char varaible and print the days on the bases of char value
	'M' or 'm' -> Monday
	'S' or 's' -> Saturday, Sunday
	'F' or 'f' -> Friday
	'T' -> Tuesday, Thursday
	'W' -> Wednesday
	'X' -> Invalid Char

*/
public class SwitchDemo1 
{
	public static void main(String a[])
	{
		char ch = 'M';
		switch(ch)
		{
			case 'M': 
			case 'm':
				System.out.println("Monday");
				break;
			case 'T':
			case 't':
				System.out.println("Tuesday or Thursday");
				break;
			case 'S': case 's':
				System.out.println("Saturday or Sunday");
				break;
			case 'F': case 'f':
				System.out.println("Friday");
				break;
			case 'W':
			case 'w':
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("Invalid Char...");
				break;
		}
	}
}