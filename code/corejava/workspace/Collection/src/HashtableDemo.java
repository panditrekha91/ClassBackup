import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put(123, "Abc"); // put method is used to add Key, Value pair
		table.put(1.23, 'A');
		table.put("Abc", 1264);
		table.put(true, 21.34);
		table.put(123, "PQR");
		table.put('A', "Abc");
		//table.put(null, "Abc");
		//table.put("xyz", null);
		
		System.out.println(table);
	}

}
