package day14;
class Test
{
	static int a,b;
	static
	{
		System.out.println("Inside the static block");
		a=10;
		b=20;
	}
	static void fun()
	{
		System.out.println("Inside the static method");
	}
	int x,y;
	{
		System.out.println("Inside the instance block");
	}
	void fun1()
	{
		System.out.println("Inside the instance method");
	}
	Test()
	{
		System.out.println("Inside the constructor");
		x=30;
		y=40;
	}
}
public class StaticConcept 
{
	public static void main(String[] args) 
	{
		Test.fun();
		Test t=new Test();
		t.fun1();
	}
}
