package day22;

public class Throws 
{
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) 
	{		
		try 
		{
			div();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid denominator");
		}	
	}
}