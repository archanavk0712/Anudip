package day7;
class Addition2
{
	int c;
	void add(int x , int y)
	{
		c=x+y;
		System.out.println(c);	
	}
}
public class Method_Type2 
{
	public static void main(String[] args) 
	{
			Addition2 ab= new Addition2();
			int a=10;
			int b=20;
			ab.add(a,b);
	}
}