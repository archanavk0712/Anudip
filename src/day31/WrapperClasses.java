package day31;

public class WrapperClasses
{
	public static void main(String[] args) 
	{		
	//	primitive way of representing
		int number=10; 
		char c='A';
		
	//  Non-primitive way of representing 
		Integer num=new Integer(10);
		System.out.println(num);	
		Character ch=new Character('A');
		System.out.println(ch);
		
	//  AutoBoxing
		int i=5;
		Integer j=new Integer(i);
		System.out.println(j);	

		
	//  AutoUnboxing
		Integer a=new Integer(50);
		int d=c;
		System.out.println(d);	

	}
}
