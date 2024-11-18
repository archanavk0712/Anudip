package day26;
import java.util.Scanner;
public class MultiThreading 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Addition task started");
		Scanner in=new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int a=in.nextInt();
		System.out.print("Enter the second number: ");
		int b=in.nextInt();
		int c=a+b;
		System.out.println("The sum is: "+c);
		System.out.println("Addition task is completed");
		System.out.println(" ");
		
		System.out.println("Character printing task started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			Thread.sleep(4000);
		}
		System.out.println("Character task is completed");
		System.out.println(" ");
		
		System.out.println("Number printing task started");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(4000);
		}
		System.out.println("Number printing task is completed");
	}
}
