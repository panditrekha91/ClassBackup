import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollectionDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(98);
		list.add(76);
		list.add(89);
		list.add(86);
		list.add(56);
		getAverage(list);
		getAverageByIterator(list);
	}
	
	public static void getAverage(ArrayList<Integer> list) {
		double sum = 0;
		
		for(int value : list) {
			sum += value;
		}
		
		/*for(Object value : list) {
			int val = (Integer) value; // Explicit Casting
			sum += val;
		}*/
		
		double avg = sum / list.size();
		System.out.println("Average is : " + avg);
	}
	
	
	
	public static void getAverageByIterator(ArrayList<Integer> list) {
		double sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int value = it.next();
			sum += value;
		}
		double avg = sum / list.size();
		System.out.println("Average is : " + avg);
	}

}
