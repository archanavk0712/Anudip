package day30;

import java.util.ArrayList;
import java.util.Collections;

public class EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int a[]= { 10, 20, 30, 40};
		for(int i:a)
		{
			System.out.println(i);
		}

		System.out.println("---------------");
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(98);
		al.add(93);
		al.add(35);
		System.out.println("Before Sorting: ");
		for(Object i : al )
		{
			System.out.println(i);
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
