package day13;
class Bike
{
	private String name;
	private int mileage;
	private int cost;
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
	}
	public Bike()  //zero parameterized constructor
	{
		name="BMW";
		mileage=20;
		cost=20000;
	}
	public Bike(String name, int mileage, int cost)   //parameterized constructor
	{
		this(name);
		//this.name=name;
		//this.mileage=mileage;
		//this.cost=cost;
	}
	public Bike(String name)
	{
		this();
		this.name=name;
	}
}
public class LocalChaining 
{
	public static void main(String[] args) 
	{
		//Bike b1= new Bike();
		//System.out.println(b1.getName());
		//System.out.println(b1.getMileage());
		//System.out.println(b1.getCost());
		//System.out.println("-------------");
		Bike b2= new Bike("Swift",30,30000);
		System.out.println(b2.getName());
		System.out.println(b2.getMileage());
		System.out.println(b2.getCost());
		Bike b3= new Bike();
		System.out.println(b3.getName());
		System.out.println(b3.getMileage());
		System.out.println(b3.getCost());
	}
}
