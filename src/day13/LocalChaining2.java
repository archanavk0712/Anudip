package day13;
class Motor
{
	private String name;
	private int mileage;
	private int cost;
	public Motor(String name, int mileage, int cost)   //parameterized constructor
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}
	public Motor()
	{
		
	}
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
	}
}
public class LocalChaining2 
{
	public static void main(String[] args) 
	{
		Motor m3= new Motor();
		System.out.println(m3.getName());
		System.out.println(m3.getMileage());
		System.out.println(m3.getCost());	
	}

}
