/* Rule8---> An interface can extend another interface. Not only this it can inherit from
 * multiple interfaces because diamond shape problem does not exist. Multiple inheritance in java can be 
 * indirectly achieved by making use of interface.
 */
package day20;
interface Ca
{
	void add();
	void sub();
}
interface Calcu 
{
	void mul();
	void div();
}
interface Calcul extends Ca,Calcu
{
	void mod();
	void dif();
}
class MyCalcu implements Calcul
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
	public void mod()
	{
		int a=10;
		int b=20;
		int c=a%b;
		System.out.println("The mod is:"+c);
	}
	public void dif()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("The difference is:"+c);
	}
}
public class InterfaceRule8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
