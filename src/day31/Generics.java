package day31;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generics 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java"); //-->l.add(new String("Java"));
		al.add("Python");
	//	al.add(20); --> because we have mentioned the element type as String already
		for(String s : al )
		{
			System.out.println(s);
		}
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(23); //-->l.add(new Integer(10));
		l.add(20);
		l.add(21);
	//  l.add("abc"); -->because we have mentioned the element type as Integer already
		for(Integer a:l)
		{
			System.out.println(l);
		}
	}
}
