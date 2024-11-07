package day19;
//  final class test  error: because final class cannot be inherited
class test
{
	final int a=100;  //final variable
	final void fun()
	{
		System.out.println("Inside the parent class method");
	}
}
class test1 extends test
{
	final int a=100;  //final variable
  // void fun()  error:  because fun() is set to final in parent class
	void fun1()
	{
		System.out.println("Inside the child class overridden method");
	}
}
public class FinaleKeyword 
{
	public static void main(String[] args) 
	{
		test1 t= new test1();
		System.out.println(t.a);
	//	t.a=100;  error: becuase a value is set to final
		System.out.println(t.a);
		t.fun();
		t.fun1();
	}
}
