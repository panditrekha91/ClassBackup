
public class MultipleInheritance {
	public static void main(String[] args) {

	}
}
interface Tyer 
{

	public void tyerBrand();
	public void typeTyer();
}

interface MusicSystem
{
	public void systemBrand();
	public void musicSystemDesc();
}

interface Engine
{
	public void hp();
	public void taquare();
}

interface Car1 extends Tyer, MusicSystem, Engine
{

}

interface Bike extends Tyer, Engine
{
	
}

// one interface can extends more than one interface 
interface Arioplane extends Tyer, Engine {
}

// One Class can implements more than one interface
abstract class MercedesBenz implements Tyer, Engine, MusicSystem {
}


abstract class Toyota {
	
}

// One class can extends another class and implements more than one interface
abstract class Fortuner extends Toyota implements Tyer, Engine, MusicSystem
{
	
}

















interface I1
{
	public void m1();
}


interface I2 
{
	public void m2();
}

// Multiple Inheritance
interface I3 extends I1, I2
{
	public void m3();
}
