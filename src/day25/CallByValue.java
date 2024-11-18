package day25;

public class CallByValue 
{
	public static void main(String[] args) 
	{		
		int a=10;
		System.out.println(a);
		
		int b;
		b=a;
		System.out.println(b);
		b=b+2;
		
		System.out.println(a);
		System.out.println(b);
	}

}
