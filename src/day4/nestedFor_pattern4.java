package day4;

public class nestedFor_pattern4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=1;j++)//stars
			{
				for(int k=0;k<=i;k++)
				{
				System.out.print("  ");
				}
			System.out.print("*");
			}
		System.out.println(" ");
		}
	}
}

