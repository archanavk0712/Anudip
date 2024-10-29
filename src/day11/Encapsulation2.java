package day11;
class CarDetails2
{
	private String name;
	private int mileage;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class Encapsulation2 
{
	public static void main(String[] args) 
	{
		CarDetails2 c= new CarDetails2();
		c.setName("Hyundai");
		c.setMileage(20);
		c.setCost(20000);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getCost());
	}

}
