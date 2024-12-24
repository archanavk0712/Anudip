package day38;

public class StringBuilderExample
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("Hello!!");
		System.out.println(sb);
		System.out.println("=====================");
		
	//  sb.append(String)
		sb.append("Good evening");  
		System.out.println(sb);
			
		System.out.println("=====================");
	
	//  sb.insert(index,String)
		sb.insert(6, "everyone");
		System.out.println(sb);
			
		System.out.println("=====================");
	
	//  sb.replace(start index, end index, String)	
		sb.replace(0, 5, "Hi"); 
		System.out.println(sb);
			
		System.out.println("=====================");
			
	//	sb.ensureCapacity(Capacity value)
		sb.ensureCapacity(3);
		System.out.println(sb);
	}
}
