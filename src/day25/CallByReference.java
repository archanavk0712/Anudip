package day25;
class car
{
	String name;
	float mileage;
	int cost;
}
public class CallByReference 
{
	public static void main(String[] args) 
	{		
		car c=new car();
		c.name="BMW";
		c.mileage=30f;
		c.cost=75;
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		System.out.println(" ");
		car b;
		b=c;
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		System.out.println(" ");
		
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		System.out.println(" ");
		
		b.name="Benz";
		b.mileage=20f;
		b.cost=80;
		System.out.println(b.name);
		System.out.println(b.mileage);
		System.out.println(b.cost);
		System.out.println(" ");
		
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		System.out.println(" ");
	}
}
