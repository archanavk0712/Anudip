package day8;

class Rectangle
{
	int area(int l, int b)
	{
		return l*b;
	}
	float area(int l, float b)
	{
		return l*b;
	}
	int area(int l,int b, int h)
	{
		return l*b*h;
	}
	float area(float b, int l)
	{
		return l*b;
	}
}
public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Rectangle r= new Rectangle();
		System.out.println(r.area(12, 54));
		System.out.println(r.area(56, 80.5f));
		System.out.println(r.area(6, 6, 6));
		System.out.println(r.area(12f, 45));
	}
}
