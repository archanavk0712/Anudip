package day30;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(98);
		al.add(93);
		al.add(35);
		System.out.println("Before Sorting: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		
		}
	//	System.out.println("Before Sorting: "+al);
	//	Collections.sort(al);
	//	System.out.println("Before Sorting: "+al);
		
	}
}
