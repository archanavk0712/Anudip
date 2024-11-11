package day21;
import java.util.Scanner;
public class ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a= in.nextInt();
		System.out.println("Enter the value of b");
		int b= in.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index"); 
		}
		catch(Exception e)
		{
			System.out.println("Cannot Divide by zero,Invalid Input");
		}
	}
}
