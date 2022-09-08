import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomObjectDemo {

	public static void main(String[] args) {
		Student st1 = new Student(1, "A");
		Student st2 = new Student(11, "C");
		Student st3 = new Student(21, "Z");
		Student st4 = new Student(14, "X");
		Student st5 = new Student(1, "A");
		Student st6 = new Student(5, "P");
		
		SortByName nameSort = new SortByName();
		SortById idSort = new SortById();
		
		TreeSet<Student> set = new TreeSet<Student>(nameSort);
		set.add(st1); 
		set.add(st2); 
		set.add(st3);
		set.add(st4);
		set.add(st5);
		set.add(st6);

		System.out.println(set);		
	}
}

class Student //implements Comparable<Student>
{
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id: " + id + " name: "+name +"\n";
	}
	/*@Override
	public int compareTo(Student o) {
		if(id > o.id) {
			return 1;
		} 
		else if(id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}*/
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}


class SortById implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id > o2.id) {
			return 1;
		} 
		else if(o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}





















