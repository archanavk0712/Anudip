package day7;

class Addition3
{
	int a,b,c;
	int add()
	{
		a=10;
		b=20;
		c=a+b;
		return c;
	}
}
public class Method_Type3 
{
	public static void main(String[] args) 
	{
		Addition3 ab= new Addition3();
		int res;
		res=ab.add();
		System.out.println(res);	
	}
}
