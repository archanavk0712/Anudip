package day7;
class Addition4
{
	int c;
	int add(int x , int y)
	{
		c=x+y;
		return c;
	}
}
public class Method_Type4 
{
	public static void main(String[] args) 
	{
		Addition4 ab= new Addition4();
		int a=10;
		int b=20;
		int res=ab.add(a,b);
		System.out.println(res);	
	}
}

