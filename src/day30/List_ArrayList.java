package day30;
import java.util.ArrayList;
import java.util.List;
public class List_ArrayList
{
	public static void main(String[] args) 
	{	
		List l=new ArrayList();
	//	ArrayList l=new ArrayList();
		
	//	add()is used to add an object into the collection
		l.add(10);
		l.add(20);
		l.add(30.5);
		l.add(40);
		l.add("abc");
		System.out.println(l);
		System.out.println("--------------");
		
	//	size()is used to return the length of the collection
		System.out.println(l.size());
		System.out.println("--------------");
		
	//  get() is used to return an object based on the index value
		System.out.println(l.get(3));
	}
}
