/*Rule 7 --> An interface cannot implement another interface,
because interface cannot provide methods with bodies inside it. */
package day20;
interface MyCalucl
{
	void add();
	void sub();
}
// interface Calc implemets Cal-->error
interface Calc
{
	void mul();
	void div();
}
public class InterfaceRule7 
{
	public static void main(String[] args) 
	{

	}

}
