package day22;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid denominator");
		}
		finally
		{
			System.out.println("Inside finally block");
			System.out.println("They are natural numbers");
			try
			{
			
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
