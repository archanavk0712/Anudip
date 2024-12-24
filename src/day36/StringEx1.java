package day36;

class Car
{
	
}
public class StringEx1
{
	public static void main(java.lang.String[] args) 
	{
		Car c=new Car();
	//  implicitly calling toString()
		System.out.println(c);
		
		System.out.println("========================");
		
	//  explicitly calling toString()
		System.out.println(c.toString());
		
		System.out.println("========================");
		
	//  Calling hashCode()
		System.out.println(c.hashCode());
		
		System.out.println("========================");
		
		Car c1=new Car();
		Car c2=new Car();
		System.out.println(c1.equals(c2));
		
	}
}
