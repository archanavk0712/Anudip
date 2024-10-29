package day9;
//accessing non-static variables inside same class 
class Example
{
	//non static variables
		int age=20;
		String name="abc";
}
public class ClassExample 
{
	public static void main(String[] args) 
	{
		Example e= new Example();
		System.out.println("Student age is "+e.age);
		System.out.println("Student name is "+e.name);
	}

}
