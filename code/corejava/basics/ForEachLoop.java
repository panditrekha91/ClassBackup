public class ForEachLoop
{
	public static void main(String[] args)
	{
		int values[] = {78,56,98,45,98};

		int sum = 0;
		for(int i =0 ; i<values.length ; i++) 
		{
			sum = sum + values[i];	
		}
		System.out.println(sum);


		int add = 0;
		for(int num : values)
		{
			add = add + num;
		}
		System.out.println(add);
	}
}