import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(123);
		set.add(432);
		set.add(1234);
		set.add(423);
		set.add(432);
		set.add(111);
		//set.add("Abc"); // java.lang.ClassCastException
		//set.add(12.34);
		System.out.println(set);
		
		
		TreeSet set1 = new TreeSet();
		set1.add("Ravi");
		set1.add("Suraj");
		set1.add("Roshni");
		set1.add("Sunny");
		set1.add("Josh");
		set1.add("crishtin");
		set1.add("Mamta");
		set1.add("Sunil");
		
		System.out.println(set1);
		
	}

}
