
public class SuperKeyword {
	public static void main(String[] args) {
		B obj = new B();
		obj.square();
	}
}

class A {
	int a = 10;

	public void print() {
		System.out.println("Super Class : Print");
	}
}

class B extends A {
	int a = 20;

	public void print() {
		System.out.println("Sub Class : Print");
	}

	public void square() {
		System.out.println("Square is : " + (super.a * super.a));
		super.print();
	}
}
