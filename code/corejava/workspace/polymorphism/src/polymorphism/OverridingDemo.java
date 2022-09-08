package polymorphism;

public class OverridingDemo {
	public static void main(String[] args) {
		/*ICICI icici = new ICICI();
		icici.homeLoanInterestRate();
		
		SBI sbi = new SBI();
		sbi.homeLoanInterestRate();*/
		showHomeInterestRate(new SBI());
		showHomeInterestRate(new ICICI());
		showHomeInterestRate(new HDFC());
		showHomeInterestRate(new Bank());
	}
	
	public static void showHomeInterestRate(Bank b) {
		b.homeLoanInterestRate();
	}
	
	
	
}

class Bank {
	public void homeLoanInterestRate() {
		System.out.println("RBI : 7.2%");
	}
	
	public final void ppfInterestRate() {
		System.out.println("RBI : 7.5%");
	}
	
	public static void carLoanInterestRate() {
		System.out.println("RBI : 11.5%");
	}
}

class ICICI extends Bank {
	@Override
	public void homeLoanInterestRate() {
		System.out.println("ICICI : 7.4%");
	}
}

class SBI extends Bank {
	@Override
	public void homeLoanInterestRate() {
		System.out.println("SBI : 7.2%");
	}
}

class HDFC extends Bank {
	@Override
	public void homeLoanInterestRate() {
		System.out.println("HDFC : 7.5%");
	}
}

// public -> protected -> default -> private
class Person {
	void intro() {
		System.out.println("I am a Person");
	}
}

class Doctor extends Person {
	public void intro() {
		System.out.println("I am a Doctor");
	}
}

class Employee extends Person {
	public void intro() {
		System.out.println("I am a Employee");
	}
}

class Student extends Person {
	public void intro() {
		System.out.println("I am a Student");
	}
}