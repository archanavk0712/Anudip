package day35;

import java.util.LinkedHashMap;
import java.util.Set;

public class Set_LinkedHashMap 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(10, "Java");
		lhm.put(11, "SQL");
		lhm.put(12, "Web");
		System.out.println(lhm);	
		
		Set<Integer> s1=lhm.keySet();
		for(Integer s:s1)
		{
			System.out.println(s1);
		}
	}
}
