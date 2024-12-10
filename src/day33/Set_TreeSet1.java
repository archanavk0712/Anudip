package day33;

import java.util.TreeSet;
class Car implements Comparable<Car>
{
	int cost;
	Car(int cost)
	{
		this.cost=cost;
	}
	public String toString()
	{
		return "Cost:"+cost;
	}
	public int compareTo(Car c)
	{
		return this.cost-c.cost;
	}
}
public class Set_TreeSet1 
{
	public static void main(String[] args) 
	{
		Car c=new Car(100);
		Car c1=new Car(100);
		Car c2=new Car(100);
		
		TreeSet<Car> ts=new TreeSet<Car>();
		ts.add(c);
		ts.add(c1);
		ts.add(c2);
		for(Car i:ts)
		{
			System.out.println(i);
		}
	}
}