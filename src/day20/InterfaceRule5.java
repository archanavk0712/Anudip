/*Rule 5 --> If a class partially implements interface ,
it must declare itself as abstract. */
package day20;
interface Cal
{
	void add();
	void sub();
}
abstract class MyCalculator implements Cal
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The sum is:"+c);
	}
}
public class InterfaceRule5 
{
	public static void main(String[] args) 
	{
		
	}

}
