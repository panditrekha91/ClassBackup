public class ThisKeyword1 {
	public static void main(String[] args) {
		Student std1 = new Student(1, "Abc", "990909090", "Mumbai");
		std1.displayStudentDetails();
		System.out.println("===============================");
		Student std2 = new Student(11, "Xyz", "99098776");
		std2.displayStudentDetails();
	}
}

class Student {

	private int id;
	private String name;
	private String contact;
	private String city;
	private final String clgName = "LMN College";

	public Student(int id, String name, String contact, String city) {
		this(id,name,contact); // call another constructor of same class
		this.city = city; // access instance variable explicitly using this keyword.
		this.displayStudentDetails(); // access the method of same class using this keyword (using this keyword is optional here)
	}

	public Student(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public Student( String city, int id, String contact) {
		super();
		this.id = id;
		this.city = city;
		this.contact = contact;
	}

	public void displayStudentDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("City : " + city);
		System.out.println("College Name : " + clgName);
	}

}
