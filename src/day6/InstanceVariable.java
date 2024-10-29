package day6;

class Dog
{
	String name;
	String breed;
	int cost;
}
public class InstanceVariable 
{
	public static void main(String[] args) 
	{
	Dog d= new Dog();
	System.out.println(d.name);
	System.out.println(d.breed);
	System.out.println(d.cost);
	System.out.println("===========================");
	d.name="Scooby";
	d.breed="Pug";
	d.cost=1200;
	System.out.println(d.name);
	System.out.println(d.breed);
	System.out.println(d.cost);
	}

}
