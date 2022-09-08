
public class MultilevelDemo  extends Object {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}

class GrandParent extends Object
{
	int x= 10;
}

class Parent extends GrandParent
{
	int y= 20;
}

class Child extends Parent
{
	int z= 30;
	
	public void print() {
		System.out.println(x); // 10
		System.out.println(y); // 20
		System.out.println(z); // 30
	}
}