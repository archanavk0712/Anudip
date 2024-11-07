/*Rule 4. Specialized methods cannot be accessed directly
using interface type reference. */
package day20;
interface Calci
{
	void add();
	void sub();
}
class MyCalci1 implements Calci
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
	public void mul()  //Specialized method
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("The product is:"+c);
	}
}
public class InterfaceRule4 
{
	public static void main(String[] args) 
	{
		MyCalci1 c=new MyCalci1();
		Calci c1;
		c1=c;
		c1.add();
		c1.sub();
	//	c1.mul();  error: because c1-->interface reference , mul()-->specialized method
		((MyCalci1)(c)).mul();
	}

}
