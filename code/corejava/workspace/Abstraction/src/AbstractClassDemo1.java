
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Dummy d = new Test(); // Polymrophic
		Dummy.m1();
	}
}

abstract class Dummy
{
	public Dummy() {
		System.out.println("This is Dummy class Constructor");
	}	
	abstract void m();
	
	final static void m1() {
		System.out.println("This is m1");
	}
}


class Test extends Dummy {
	public Test() {
		super();
	}
}
