package day21;
public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		try
		{
		System.out.println(a[1]);
		System.out.println(a[20]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index"); 
		}
	}
}

	