
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {

	}
}

@FunctionalInterface
interface Inter2
{
	public void m1();
	public default void m2() {
		
	}
}