package day26;
/*In the above code, all the three activities that is addition, 
 * printing alphabets and printing numbers are written inside run()
 * and every class is extending Thread class. Since every class is 
 * extending thread class, when an object is created of these thread 
 * classes, new stack gets created and now thread scheduler creates
 * new thread for each of these stacks due to which concurrent 
 * execution takes place and CPU time is utilized efficiently*/
import java.util.Scanner;
class Add extends Thread
{
	public void run()
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
	}
}
class PrintCharacter extends Thread
{
	public void run() 
	{
		System.out.println("Character printing task started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try
			{
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Invalid value");
			}
		}
		System.out.println("Character task is completed");
		System.out.println(" ");
	}
}

class PrintNumber extends Thread
{
	public void run()
	{
		System.out.println("Number printing task started");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Invalid value");
			}
		}
		System.out.println("Number printing task is completed");
	}
}

public class MultiThreading2 
{
	public static void main(String[] args) 
	{		
		Add a=new Add();
		a.start();
		
		PrintCharacter c=new PrintCharacter();
		c.start();
		
		PrintNumber n=new PrintNumber();
		n.start();
	}
}
