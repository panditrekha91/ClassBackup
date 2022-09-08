
public class LambdaExpressionDemo {
	public static void main(String[] args) {
		Inter in = (a, b) -> System.out.println("Addition : " + (a+b));
		in.add(23,22);
		
		//=================================
		
		/*
		Calculation mul = (int a, int b) -> {
			int ans = a * b;
			return ans;
		};
		*/
		
		Calculation mul = (a, b) ->  a * b;
		
		
		functionArgument((a,b) -> a/b);
	
	}
	
	
	
	public static void functionArgument(Calculation div) {
		System.out.println(div.calcuate(22,6));
	}
	
	
}


class Demo implements Calculation {
	@Override
	public int calcuate(int a, int b) {
		return a/b;
	}
}

@FunctionalInterface
interface Inter {
	public void add(int a, int b);
}


@FunctionalInterface
interface Calculation {
	public int calcuate(int a, int b);
}






