/*
	1	2	3	4
	1	2	3	4
	1	2	3	4
*/

public class NestedFor
{
	public static void main(String args[])
	{
		for(int r = 1 ; r <= 3 ; r++ )   // row
		{
			for(int c = 1 ; c <= 4 ; c++ )   // column
			{
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}