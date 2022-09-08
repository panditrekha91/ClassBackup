public class CompareNumber
{
	public static void main(String args[])
	{		
		CompareNumber compare = new CompareNumber();
		int value = compare.getLargest(34,123);
		System.out.println(value);
		
		int small = compare.getSmallest(23,12);
		System.out.println(small);
		byte x = 11;
		compare.addition(12, 3, 12.2f, 34l, x);
	}


	public void addition(int n1, int n2, float n3 , long n4, byte n5)
	{
		double ans = n1 + n2 + n3 + n4 + n5;
		System.out.println(ans);
	}

	// create a method which accept 2 int value as a input param and return the smallest number
	public int getSmallest(int n1, int n2)
	{
		if(n1 < n2) {
			return n1;
		}
		else {
			return n2;
		}
	}

	//create a method (getLargest) which accept 2 int values as a input parameter and return the largest number
	public int getLargest(int num1, int num2)
	{
		int ans = 0;
		if(num1>num2) {
			ans = num1;
		} 
		else {
			ans = num2;
		}
		return ans;
	}
}