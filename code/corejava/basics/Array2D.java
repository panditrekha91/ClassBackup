public class Array2D
{
	public static void main(String[] args)
	{
		int marks[][]; // declare

		marks = new int[3][5]; // Instance/Object Creation
		
		marks[0][0] = 70;
		marks[0][4] = 50;
		marks[1][2] = 60;
		marks[2][1] = 80;

		//int marks[][] = { {55 , 66, 77, 88, 99}, {67, 65, 78, 89, 76}, {88, 66, 76, 87, 85} };

		for(int r = 0 ; r<3 ; r ++)
		{
			for(int c = 0 ; c<5 ; c++)
			{
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
  
	}
}