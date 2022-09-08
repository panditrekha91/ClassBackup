
public class SIngleInheritanceDemo {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		b.test();
	}
}

class A
{
	int a= 10;
	public void print() {
		System.out.println("This is the method from class A..");
	}
}


class B extends A
{
	int x = 20;
	int a = 30;
	public void test() {
		System.out.println(super.a);
		System.out.println(x);
		System.out.println("This is the method from class B...");
	}
}
