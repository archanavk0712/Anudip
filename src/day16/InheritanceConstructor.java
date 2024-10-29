package day16;
class Object
{
	Object()
	{
		
	}
}
class test extends Object
{
	int x,y;
	test()
	{
		x=50;
		y=60;
	}
	test(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class test0 extends test
{
	int a,b;
	test0()
	{
		a=10;
		b=20;
	}
	test0(int a, int b)
	{
		super(a,b);
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
public class InheritanceConstructor 
{
	public static void main(String[] args) 
	{
		test0 t= new test0();
		t.display();
	}

}
