import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(123);
		set.add(1223);
		set.add(1.23);
		set.add("Abc");
		set.add("Xyz");
		set.add(123);
		set.add("Abc");
		
		System.out.println(set);
		
		
	}
}
