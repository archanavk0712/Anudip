package day5;
public class Constructor 
{
	Constructor(int a,int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	public static void main(String[] args) 
	{
		Constructor c= new Constructor(2,4);
	}

}
