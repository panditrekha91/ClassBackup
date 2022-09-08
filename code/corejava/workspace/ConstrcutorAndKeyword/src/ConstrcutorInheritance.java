
public class ConstrcutorInheritance {
	public static void main(String[] args) {
		Child ch = new Child(20);
		//Parent p = new Parent(10);
	}
}

// Every Child/sub class constructor access the default or no-param constructor of the super class. This is happening because of super keyword.
class Parent {
	public Parent() {
		System.out.println("Parent no-param constrcutor..");
	}
	public Parent(int a) {
		System.out.println("Parent 1-param constrcutor..");
	}
}

class Child extends Parent {
	public Child() {
		super(20);
		System.out.println("Child no-param constrcutor..");
	}
	public Child(int a) {
		super(30);
		System.out.println("Child 1-param constrcutor..");
	}
}

