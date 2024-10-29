package day13;
class car
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
	public car()  //zero parameterized constructor
	{
		name="BMW";
		mileage=20;
		cost=20000;
	}
	public car(String name, int mileage, int cost)   //parameterized constructor
	{
		super();
		this.name = name;
		this.mileage = mileage;
		this.cost = cost;
	}
}
public class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		car c1= new car();
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		System.out.println("-------------");
		car c2= new car("Swift",30,30000);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
	}
}
