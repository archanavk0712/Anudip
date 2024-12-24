package day36;

public class StringEx3 {

	public static void main(String[] args) 
	{
	//  1.Empty representation of a string object
		String s1=new String();
		System.out.println(s1);
		
	//  2.Passing set of characters	
		String s2=new String("Abc");
		System.out.println(s2);
		
	//  3.Converting Character to String
		char[] c= {'a','b','s'};
		String s3=new String(c);
		System.out.println(s3);
	}
}
