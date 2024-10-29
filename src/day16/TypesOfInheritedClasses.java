package day16;
class Plane
{
	void takeOff()
	{
		System.out.println("Plane is taking Off");  //Inherited methods
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing"); //Inherited methods
	}
}
class CargoPlane extends Plane
{
	void fly() //overridden methods
	{
		System.out.println("Plane is flying at low heights");
	}
	void carryCargo()  //specialized methods
	{
		System.out.println("Cargo Plane carries cargo");
	}
}
class PassengerPlane extends Plane
{
	void fly() //overridden methods
	{
		System.out.println("Plane is flying at medium heights");
	}
	void carryPassenger()  //specialized methods
	{
		System.out.println("Passenger Plane carries passenger");
	}
}
class FighterPlane extends Plane
{
	void fly() //overridden methods
	{
		System.out.println("Plane is flying at higher heights");
	}
	void carryWeapons()  //specialized methods
	{
		System.out.println("Fighter Plane carries weapons");
	}
}
public class TypesOfInheritedClasses 
{
	public static void main(String[] args) 
	{
		CargoPlane c = new CargoPlane();
		c.takeOff();
		c.fly();
		c.land();
		c.carryCargo();
		PassengerPlane p = new PassengerPlane();
		p.takeOff();
		p.fly();
		p.land();
		p.carryPassenger();
		FighterPlane f = new FighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.carryWeapons();
	}
}