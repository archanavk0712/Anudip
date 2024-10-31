package day17;
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
public class Polymorphism 
{
	public static void main(String[] args) 
	{
		// we have three different references exhibiting 
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		FighterPlane f = new FighterPlane();
		
		Plane pl;  //parent type reference
		
		pl=c;  //assigning child type reference to the parent type
		pl.takeOff();  //one reference one behavior 
		pl.fly();
		pl.land();
		// pl.CargoPlane();   This will throw an error because this method is not present in parent class 
		((CargoPlane)(pl)).carryCargo();  //DownCasting
		
		pl=p;
		pl.takeOff();
		pl.fly();
		pl.land();
		((PassengerPlane)(pl)).carryPassenger();
		
		pl=f;
		pl.takeOff();
		pl.fly();
		pl.land();
		((FighterPlane)(pl)).carryWeapons();
	}
}