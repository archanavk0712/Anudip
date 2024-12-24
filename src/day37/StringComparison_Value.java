package day37;

public class StringComparison_Value 
{
	public static void main(String[] args) 
	{
	//	Example1
		String s1="Java";
		String s2="Java";
		if(s1.equals(s2))
		{
			System.out.println("Equal");		
		}
		else
		{
			System.out.println("Not Equal");	
		}
		
	//  Example2	
		String n1=new String("Java");
		String n2="Java";
		if(n1.equals(n2))
		{
			System.out.println("Equal");		
		}
		else
		{
			System.out.println("Not Equal");	
		}
		
	//  Example3	
		String p1=new String("Java");
		String p2=new String("Java");
		if(p1.equals(p2))
		{
			System.out.println("Equal");		
		}
		else
		{
			System.out.println("Not Equal");	
		}
	}
}
