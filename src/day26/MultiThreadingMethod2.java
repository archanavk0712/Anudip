package day26;
import java.util.Scanner;
class Demo implements Runnable
{
	public void run()
	{
		Thread t=Thread.currentThread();
		String name =t.getName();
		if(name.equals("ADD")==true)
		{
			add();
		}
		else if(name.equals("CHAR")==true)
		{
			charPrint();
		}
		else
		{
			numberPrint();
		}
	}
	void add()
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
	void charPrint()
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
	void numberPrint()
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
public class MultiThreadingMethod2 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
		t1.setName("ADD");
		t1.start();
		Thread t2=new Thread(d1);
		t2.setName("CHAR");
		t2.start();
		Thread t3=new Thread(d1);
		t3.start();
		t3.setName("NUM");
	}
}
