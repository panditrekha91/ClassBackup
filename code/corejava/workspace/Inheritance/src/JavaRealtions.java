public class JavaRealtions {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name="A";
		emp.id=12;
		emp.experience.preOrg = "Xyz Pvt.Ltd.";
		
		Person per = new Person();
		per.name = "Xyz";
	}
}

class Person {
	String name;
	String adrress;
	int age;
	// function
}

// Employee IS-A Person
class Employee extends Person {
	int id;
	double salary;
	String compnayName;
	ProfessionalExperience experience = new ProfessionalExperience(); // Employee HAS-A ProfessionalExperience 
}

class Student extends Person {
	
}

class ProfessionalExperience {
	String preOrg;
	String projects;
	int yearExperience;
}





































