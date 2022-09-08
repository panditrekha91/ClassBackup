
public class StaticKeyword {
	public static void main(String[] args) {
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		
		System.out.println("Obj1-Name " + obj1.name);
		System.out.println("Obj2-Name " + obj2.name);
		System.out.println(StaticExample.name);
		
		/*StaticExample.name = "NA";
		
		System.out.println("Obj1-Name " + obj1.name);
		System.out.println("Obj2-Name " + obj2.name);*/
		
		StaticExample.print(); // accessing static method with class name
	}
}

class StaticExample
{
	
	int a;
	static String name;
	
	static {
		name = "Default Name";
	}
	
	
	static class Demo {
		
	}
	
	public static void print() {
		System.out.println("This is static method...");
		System.out.println(name);
		//System.out.println(this.a);
	}
}
