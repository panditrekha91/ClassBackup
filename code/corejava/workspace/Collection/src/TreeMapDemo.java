import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("Abc", 234);
		map.put("Xyz", 'A');
		map.put("Pqr", 24);
		map.put("Stu", "Abc");
		map.put("Lmn", true);
		map.put("Abc", 111);
		map.put("Zyx", null);
		map.put("Bac", null);
		
		System.out.println(map);
	}
}
