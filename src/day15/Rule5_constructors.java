package day15;
class test1 extends Object
{
	int x,y;
	test1()
	{
		super();
		x=100;
		y=200;
	}
	test1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class test2 extends test1
{
	int a,b;
	test2()
	{
		super();
		a=200;
		b=300;
	}
	test2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class Rule5_constructors 
{
	public static void main(String[] args) 
	{
		test2 t= new test2();
		t.display();
	}
}