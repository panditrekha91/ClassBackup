package institute.staff.hr;

//import student.StudentInfo;
//import student.StudentAttendance;
import student.*;
import java.util.*;

public class HrDetails {

	String str = new String();
	//student.StudentInfo studInfo = new student.StudentInfo();
	StudentInfo studInfo = new StudentInfo();
	StudentAttendance studAttendance = new StudentAttendance();
	
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		for(int i = 1; i<= 10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
			
		}
		
		lable1:
		for(int i = 1; i<= 10; i++) {
			
			System.out.println("True");
			continue lable1;
		}
		
		
	}
}
