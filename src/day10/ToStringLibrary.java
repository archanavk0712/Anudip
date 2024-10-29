package day10;

public class ToStringLibrary 
{
	//override
	public String toString()
	{
		return "abc";
	}
	public static void main(String[] args) 
	{
		ToStringLibrary a=new ToStringLibrary();
		System.out.println(a); //implicitly it calls toString()
	//	System.out.println(a.toString()); //explicitly calling toString()
	}
}
