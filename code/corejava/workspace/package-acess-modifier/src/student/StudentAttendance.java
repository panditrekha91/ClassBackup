package student;

public class StudentAttendance extends StudentInfo {

	
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(contact);
		//System.out.println(age);
	}
	
	
	public void printByObject() {
		StudentInfo st = new StudentInfo();
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.contact);
		//System.out.println(st.age);
	}
}
