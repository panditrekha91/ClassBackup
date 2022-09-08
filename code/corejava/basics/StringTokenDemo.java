import java.util.StringTokenizer;
public class StringTokenDemo
{
	public static void main(String args[])
	{
		StringTokenizer str = new StringTokenizer("23/11/1998", "/");
		//System.out.println(str.countTokens());
		//System.out.println("Date : " + str.nextToken());
		//System.out.println("Month : " +str.nextToken());
		//System.out.println("Year : " +str.nextToken());

		int count = str.countTokens();
		for(int i = 1 ; i <= count; i++) {
			String val = str.nextToken();
			if(i==3)
			{
				System.out.println("Year : " +val);
			}
		}
	}
}

