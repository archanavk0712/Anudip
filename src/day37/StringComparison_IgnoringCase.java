package day37;

public class StringComparison_IgnoringCase 
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2="JAVA";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Equal");		
		}
		else
		{
			System.out.println("Not Equal");	
		}
	}

}
