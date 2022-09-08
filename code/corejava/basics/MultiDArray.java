public class MultiDArray
{
	public static void main(String args[])
	{
		int arr[][] = {{23,45,32,4},{324,45,6},{23,6},{56,87,56,78,98,45}};

		System.out.println(arr.length); // number of Rows
		System.out.println(arr[1].length); // number of column from 2nd row


		for(int r = 0; r < arr.length ; r++)
		{
			for(int c = 0 ; c<arr[r].length ; c++)
			{
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}

	}	
}