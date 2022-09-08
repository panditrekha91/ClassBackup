
public class FinalKeyword {

	public static void main(String[] args) {
		CircleCalculation circle = new CircleCalculation();
		circle.x = 20;
		//circle.pi = 6.34;
		circle.areaOfCircle(3);
		circle.cumferenceOfCircle(3);
	}
}

class CircleCalculation {
	
	final double pi = 3.14;
	int x = 30;
	
	final public void areaOfCircle(int r) {
		final double PI = 3.14;
		System.out.println("Area Of Circle : "+ (pi * (r * r)));
	}
	
	public void cumferenceOfCircle(int r) {
		System.out.println("Cumference Of Circle : "+ (2 * pi * r));
	}
}


final class Demo extends CircleCalculation {
  
}

 
