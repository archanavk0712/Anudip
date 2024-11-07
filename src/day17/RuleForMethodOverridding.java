package day17;
class Plane1
{
	
}
class CargoPlane1 extends Plane1
{
	
}
class SuperClass
{
	public Plane1 fun()
	{
		System.out.println("Parent class method");
		Plane1 p= new Plane1();
		return p;
	}
}
class SubClass extends SuperClass
{
	public CargoPlane1 fun()
	{
		System.out.println("Overridden child class method");
		CargoPlane1 c= new CargoPlane1();
		return c;
	}
}
public class RuleForMethodOverridding 
{
	public static void main(String[] args) 
	{
		SubClass s=new SubClass();
		s.fun();
	}
}