package day19;
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird
{
	void fly()
	{
		System.out.println("Eagle flies at a great heights");
	}
}
class SerpentEagle extends Eagle
{
	void eat()
	{
		System.out.println("Serpent Eagle flies at a greater heights");
	}
}
public class AbstractClass3 
{
	public static void main(String[] args) 
	{
		SerpentEagle s= new SerpentEagle();
		s.eat();
		s.fly();
	}

}
