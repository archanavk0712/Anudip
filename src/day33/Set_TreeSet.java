package day33;

import java.util.TreeSet;

public class Set_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(60);
		ts.add(10);
		for(int i:ts)
		{
			System.out.println(i);
		}
		
	}
}
