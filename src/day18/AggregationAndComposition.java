package day18;
class Os
{
	private String name;
	private int size;
	Os(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
class Charger
{
	private String brand;
	private int voltage;
	Charger(String brand,int voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
	public String getBrand(){
		return brand;
	}
	public int getVoltage(){
		return voltage;
	}
}
class Mobile
{
	Os os=new Os("Android",512);
	void hasA(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class AggregationAndComposition 
{
	public static void main(String[] args) 
	{
		Charger c =new Charger("iPhone",5);
		Mobile m= new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
	//	m=null;       creates an error:Cannot read field "os" because "m" is null
	//	System.out.println(m.os.getName());
	//	System.out.println(m.os.getSize());
	//	m.hasA(c);
	}
}
