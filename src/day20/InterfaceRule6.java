/*Rule 6 --->A class can implement multiple interfaces
because diamond shape problem does not exist as interface
will not have parent */
package day20;
interface Cal1
{
	void add();
	void sub();
}
interface Cal2
{
	void mul();
	void div();
}
class MyCal1 implements Cal1,Cal2
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The sum is:"+c);
	}
	public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("The difference is:"+c);
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("The product is:"+c);
	}
	public void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("The quotient is:"+c);
	}
}
public class InterfaceRule6 
{
	public static void main(String[] args) 
	{		
		MyCal1 c1=new MyCal1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}

}
