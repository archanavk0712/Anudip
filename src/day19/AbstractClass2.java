package day19;
import java.util.Scanner;
abstract class Shape
{
	float area;
	abstract void acceptInput();
	abstract void calArea();
	void displayArea()
	{
		System.out.println(area);
	}
}
class Square extends Shape
{
	float side;
	void acceptInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the Square:");
		side=in.nextFloat();
	}
	void calArea()
	{
		area = side* side;
	}
}
class Circle extends Shape
{
	float radius;
	void acceptInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle:");
		radius=in.nextFloat();
	}
	void calArea()
	{
		area = 3.141f*radius* radius;
	}
}
class Geometry
{
	void permit(Shape ref)
	{
		ref.acceptInput();
		ref.calArea();
		ref.displayArea();
	}
}
public class AbstractClass2 
{
	public static void main(String[] args) 
	{
		Square s= new Square();
		Circle c=new Circle();
		Geometry g=new Geometry();
		g.permit(s);
		g.permit(c);
	}
}
