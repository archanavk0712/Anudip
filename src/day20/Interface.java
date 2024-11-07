package day20;
import java.util.Scanner;
interface Calculator
{
	void add();
	void sub();
}
class MyCalc1 implements Calculator
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The sum is:"+c);
	}
	public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("The difference is:"+c);
	}
}
class MyCalc2 implements Calculator
{
	public void add()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a=s.nextInt();
		System.out.print("Enter the second value:");
		int b=s.nextInt();
		int c= a+b;
		System.out.println("The sum is:"+c);
	}
	public void sub()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a=s.nextInt();
		System.out.print("Enter the second value:");
		int b=s.nextInt();
		int c= a-b;
		System.out.println("The difference is:"+c);
	}
}
class MyCalc3 implements Calculator
{
	public void add()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a=s.nextInt();
		System.out.print("Enter the second value:");
		int b=s.nextInt();
		if(b==0)
		{
			System.out.println("Second number is zero");
		}
		else
		{
			int c= a+b;
			System.out.println("The sum is:"+c);
		}	
	}
	public void sub()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a=s.nextInt();
		System.out.print("Enter the second value:");
		int b=s.nextInt();
		if(b==0)
		{
			System.out.println("Second number is zero");
		}
		else
		{
			int c= a-b;
			System.out.println("The difference is:"+c);
		}	
	}
}
public class Interface 
{
	public static void main(String[] args) 
	{
		MyCalc1 c1=new MyCalc1();
		c1.add();
		c1.sub();
		System.out.println("==================");
		MyCalc2 c2=new MyCalc2();
		c2.add();
		c2.sub();
		System.out.println("==================");
		MyCalc3 c3=new MyCalc3();
		c3.add();
		c3.sub();
	}
}