package day2;

public class largest2 
{
	public static void main(String[] args) 
	{
		int a=100, b=500, c=20;
		if(a>=b)
		{
			if(a>=c)
			{
			System.out.println(a+" is the largest");
			}
			else
			{
				System.out.println(c+" is the largest");
			}
		}
		else if(b>=a)
		{
			if(b>=c)
			{
			System.out.println(b+" is the largest");
			}
			else
			{
				System.out.println(c+" is the largest");
			}
		}
	}
}