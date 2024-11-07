package day17;
class parent
{
	public void fun()
	{
		System.out.println("Parent class method");		
	}
}
class child1 extends parent
{
	// void fun()    access reduced to default: either the access specifier should be same or higher
	// public int fun()   return type changed to int: same return type as parent must be maintained
	public void fun()
	{
		System.out.println("Overridden child class method");	
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
	

	}

}
