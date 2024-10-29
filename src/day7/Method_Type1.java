package day7;
class Addition
{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);	
	}
}
public class Method_Type1 
{
	public static void main(String[] args) 
	{
		Addition a= new Addition();
		a.add();
	}
}