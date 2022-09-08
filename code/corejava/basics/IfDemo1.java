/*
	time 6-11.59 -> Morning
	time 12-17 -> Afternoon
	time 18-22 -> Evening
	time 22-24 -> Night

*/
public class IfDemo1
{
	public static void main(String args[])
	{
		double time = 49.26;

		if(time>=6 && time<=24)
		{
			if((time >= 6) && (time<=11.59))
			{
				System.out.println("Good Morning");
			}
			else if((time>=12) && (time<=17.59))
			{
				System.out.println("Good Afternoon");
			}
			else if((time>=18) && (time<=22.59))
			{
				System.out.println("Good Evening");
			}
			else 	
			{
				System.out.println("Good Night");
			}
		}
		else 
		{
			System.out.println("Invalid Time...");
		}
		
	}
}