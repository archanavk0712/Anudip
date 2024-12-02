package day32;
import java.util.HashSet;
import java.util.Set;
public class Set_HashSet 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		Set s=new HashSet();
		h.add(20);
		h.add(20.35);
		h.add(null);
		h.add(20);
		h.add("abc");
		System.out.println(h);
		for(Object o:h)
		{
			System.out.println(o);
		}
	}
}
