import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Abc");
		list.add(12);
		list.add(3.4);
		list.add('A');
		System.out.println(list);
		list.add(2, 20);
		System.out.println(list);
		
		list.addFirst(1111);
		list.addLast(2222);
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.remove(3.4);
		System.out.println(list);
		
		
		// add elements at the start of the list
		list.push(5555);
		System.out.println(list);
		
		// select and Remove the first element. if no first element available then,
		// throws an NoSuchElementException
		System.out.println("Pop Element : " + list.pop());
		System.out.println(list);
	
		// select and Remove the first element. if no first element available then,
		// It returns null value.
		System.out.println("Poll Element : " + list.poll());
		System.out.println(list);
		
		// Select the first element and it will not remove the element. 
		// returns null if no first element available.
		System.out.println("Peek Element : " + list.peek());
		System.out.println(list);
		
		
	}

}












