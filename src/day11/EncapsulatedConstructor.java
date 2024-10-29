package day11;
class Car
{
	private String name;
	private int mileage;
	private int cost;
	public Car(String name,int mileage,int cost)
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
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
public class EncapsulatedConstructor 
{
	public static void main(String[] args) 
	{
		Car c= new Car("Hyundai", 20, 20000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
	}

}
