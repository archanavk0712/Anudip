package day33;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("Pyhton");
		lhs.add("C++");
		lhs.add("JavaScript");
		for(String subject:lhs)
		{
			System.out.println(subject);
		}
	}

}
