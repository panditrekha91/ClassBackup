import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(123, "Abc"); // put method is used to add Key, Value pair
		map.put(1.23, 'A');
		map.put("Abc", 1264);
		map.put(true, 21.34);
		map.put(123, "PQR");
		map.put('A', "Abc");
		map.put(null, "Abc");
		map.put("xyz", null);
		
		System.out.println(map);
		
		System.out.println(map.get(123)); // return the value of provided key
		
		System.out.println("containsKey : " + map.containsKey(123));
		System.out.println("containsValue : " + map.containsValue(123));
		
		map.remove(123, "stu"); // remove the entry by Key and value both
		map.remove(123); // remove the entry by Key
		
		System.out.println(map);
		
		System.out.println(map.keySet()); // return only key from the Map
		System.out.println(map.values()); // return the values from the Map
		
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
		
		
	}
}












