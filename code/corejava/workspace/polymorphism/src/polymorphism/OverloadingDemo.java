package polymorphism;

public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(20, 30);
		calc.add(23.22, 32.33);
		calc.add("Abc", "Xyz");
	}
	
	public static void main(int[] args) {
		Calculator calc = new Calculator();
		calc.add(20, 30);
		calc.add(23.22, 32.33);
		calc.add("Abc", "Xyz");
	}
	
	public static void main(float[] args) {
		Calculator calc = new Calculator();
		calc.add(20, 30);
		calc.add(23.22, 32.33);
		calc.add("Abc", "Xyz");
	}
}


class Calculator 
{
	public int add(int a, int b) {
		int ans = a+b;
		System.out.println("2 int add : " + ans);
		return ans;
	}
	
	public void add(int a, int b, int c) {
		int ans = a+b+c;
		System.out.println("3 int add : " + ans);
	}
	
	public double add(double a, double b) {
		double ans = a+b;
		System.out.println("2 double add : "+ ans);
		return ans;
	}
	
	public String add(String fname, String lname) {
		String ans = fname + " " +lname;
		System.out.println("2 String Add : " + ans);
		return ans;
	}
	
	public void add(int a, float b) {
		double ans = a+b;
		System.out.println("1 int and 1 float add : " + ans);
	}
	
	public void add(float a, int b) {
		double ans = a+b;
		System.out.println("1 float and 1 int add : " + ans);
	}
	
	
	
}
