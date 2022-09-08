import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(324);
		list.add("Abc");
		list.add('C');
		list.add(3.24);
		list.add(324);
		
		System.out.println(list);
		
		//list.remove(new Character('C'));
		//list.remove(new Integer(324));
		
		
		list.add(2, "XYZ"); // add new value on index and shift the existing value. 

		System.out.println(list);
		
		
		list.remove(1);

		System.out.println(list);
		
		System.out.println(list.get(3));
		
		
		list.set(2, 'Z'); // replace the existing value of the index
		System.out.println(list);
		
		
	}
}















