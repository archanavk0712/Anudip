package day35;

import java.util.HashMap;

public class Set_HashSet 
{
	public static void main(String[] args) 
	{
		HashMap h =new HashMap();
		
	//	put() is used to add key and value inside the map
		h.put(10,"abc");  
		h.put(11,"pqr");
		h.put(12,"lmn");
		System.out.println(h);
		
		System.out.println("==========================");
		
	//	get() is used to get an value based on the key specified
		System.out.println(h.get(10));
		
		System.out.println("==========================");

	//	containsKey() is used to check if the key is present or not
	//	gives the output in the form of boolean(true/false) 
		System.out.println(h.containsKey(10));
		System.out.println(h.containsKey(14));
		
		System.out.println("==========================");
		
	//	containsValue() is used to check if the value is present or not
	//	gives the output in the form of boolean(true/false) 
		System.out.println(h.containsValue(10));
		System.out.println(h.containsValue("abc"));
		
		System.out.println("==========================");

	//	containsValue() is used to check if the value is present or not
	//	gives the output in the form of boolean(true/false) 
		h.remove(10);
		System.out.println(h);
		System.out.println(h.containsValue("abc"));
		
		System.out.println("==========================");
		
    //	isEmpty() is used to check if the map is empty or not
		System.out.println(h.isEmpty());
		
		System.out.println("==========================");
		
	//	clear() is used to clear all the elements present in the mp
		h.clear();
		System.out.println(h);
		
	}
}