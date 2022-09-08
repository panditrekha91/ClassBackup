
public class AbstractClassDemo {
	public static void main(String[] args) {
		CarDekho_com obj = new CarDekho_com();
		AudiEV8 audi8 = new AudiEV8();
		obj.showDetails(new Ertica());
	}
}

class CarDekho_com {
	public void showDetails(Car car) {
		car.brand();
		car.fuelType();
		car.numberOfWheels();
	}
}



abstract class Car
{
	int a = 10;
	abstract public void brand();
	abstract public void fuelType();
	
	public void numberOfWheels() {
		System.out.println("Car is a 4 wheeler");
	}
}

abstract class Audi extends Car {
	public void brand() {
		System.out.println("Brand : Audi");
	}
}

class AudiEV8 extends Audi
{
	public void fuelType() {
		System.out.println("Fuel Type : Electric");
	}
}


abstract class Maruti extends Car {
	public void brand() {
		System.out.println("Brand : Maruti");
	}
}

class Ertica extends Maruti {
	public void fuelType() {
		System.out.println("Fuel Type : CNG & Petrol");
	}
}




