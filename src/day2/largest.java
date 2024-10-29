package day2;

public class largest
{
	public static void main(String[] args) 
	{
		int a=10, b=5, c=20;
		if(a>=b && a>=c)
		{
			System.out.println(a+" is the largest");
		}
	
		else if(b>=a && b>=c)
		{
			System.out.println(b+" is the largest");
		}
		else if(c>=a && c>=b)
		{
			System.out.println(c+" is the largest");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
