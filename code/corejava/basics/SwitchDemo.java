
/*
	1,3,5,7,8,10,12 -> 31 Days
	2 		-> 28 or 29 Days
	4,6,11 		-> 30 Days

*/

public class SwitchDemo
{
	public static void main(String args[])
	{
		int month = 11;

		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Given Month has 31 Days");
				break;
			case 2:
				System.out.println("Given Month has 28 or 29 Days");
				break;
			case 4:
			case 6:
			case 11:
				System.out.println("Given Month has 30 Days");
				break;
		}
	}
}