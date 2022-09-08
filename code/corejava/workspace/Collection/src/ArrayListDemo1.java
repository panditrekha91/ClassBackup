import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();	
		list.add(23);
		list.add(23.45);
		list.add("Abc");
		list.add(23);
		list.add("Abc");
		list.add(true);
		
		System.out.println(list.contains("Xyz"));
		
		list.remove("Abc"); // remove the 1st occurrence of the value. if multiple occurrence are available then only 1st is removed.
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		
		ArrayList l1 = new ArrayList();	
		l1.add("Abc");
		l1.add(23);
		l1.add("Xyz");
		
		
		System.out.println(list.containsAll(l1));
		list.addAll(l1);
		
		System.out.println(list);
		
		list.removeAll(l1);
		
		System.out.println(list);
		
		list.clear();

		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
	}

}
