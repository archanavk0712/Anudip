package day30;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class List_LinkedList 
{
	public static void main(String[] args) 
	{		
	/*	
	    List ll=new LinkedList();
	//	LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(12.4);
		ll.add("one");
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}  
	*/
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println("Objects inside ArrayList:"+al+" Size : "+al.size());
		System.out.println("-----------------");
		LinkedList ll=new LinkedList();
		ll.addAll(al);
		ll.add(30);
		
	//  all(index,element)-->it will not remove any elements , it will just push the elements
		al.add(0,50); 
		
	//  set(index,element)-->it will replace the element in the index
		al.set(2, ll);
		System.out.println("Objects inside ArrayList:"+al+" Size : "+al.size());
		System.out.println("Objects inside LinkedList:"+ll+" Size : "+ll.size());
	}
}
