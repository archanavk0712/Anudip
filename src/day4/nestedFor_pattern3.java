package day4;

public class nestedFor_pattern3 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=i;j<=5;j++)//stars
			{
			System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
