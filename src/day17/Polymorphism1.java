package day17;
class Airplane  
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
class Cargo extends Airplane
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
class Passenger extends Airplane
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
class Fighter extends Airplane
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
class Airport
{
	void permit(Airplane pl) //code reduction by passing parent type reference as parameter and calling the same function
	{
		pl.takeOff();
		pl.fly();
		pl.land();
	}
}
public class Polymorphism1 
{
	public static void main(String[] args) 
	{
		Cargo c=new Cargo();
		
		Passenger p=new Passenger();
		
		Fighter f=new Fighter();
		
		Airport a=new Airport();
		a.permit(c);//code flexibility is achieved by making use of one function call for all the child type reference
		c.carryCargo();
		
		a.permit(p);
		p.carryPassenger();
		
		a.permit(f);
		f.carryWeapons();
	}

}
