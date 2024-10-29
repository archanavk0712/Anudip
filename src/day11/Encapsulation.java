package day11;
class CarDetails
{
	private String name;
	private int mileage;
	private int cost;
	public void setData(String name, int mileage, int cost)
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	public int getCost()
	{
		return cost;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		CarDetails c= new CarDetails();
		c.setData("Hyundai", 20, 20000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
	}
}
