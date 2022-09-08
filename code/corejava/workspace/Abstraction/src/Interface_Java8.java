
public class Interface_Java8 {
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.m2();
		Inter1.m3();
	}
}

interface Inter1
{
	public void m1();
	
	public default void m2() {
		System.out.println("Implemented method from Interface");
	}
	
	public static void m3() {
		System.out.println("Static implemented method from interface.");
	}
	
	public static void main(String[] args) {
		
	}
}

class A implements Inter1 {

	@Override
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	public void m2() {
		System.out.println("Modifier m2 method");
	}
	
	
}
