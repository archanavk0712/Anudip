package day38;

public class StringBufferExample 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello !!");
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
