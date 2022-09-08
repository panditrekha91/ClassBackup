
public class InterfaceDemo {
	public static void main(String[] args) {
		Inter in = new Concrete();
		in.m1();
		System.out.println(Inter.a);
		System.out.println(in.a);
	}
}

interface Inter {
	int a = 10; // public static final int a = 10;
	void m1(); // public abstract void m1();
}

class Concrete implements Inter {
	public void m1() {
		System.out.println("This is implemented method from Interface");
	}
}

abstract class AbsClass implements Inter {
	
}

class Demo extends AbsClass {
	public void m1( ) {
		
	}
}