package day32;
import java.util.Vector;
public class List_Vector 
{
	public static void main(String[] args) 
	{	
		Vector v=new Vector();
		v.add(10);
		v.add(20.45);
		v.add("Hello");
		v.add(15);
		for(Object o:v)
		{
		System.out.println(o);
		}
	}
}
