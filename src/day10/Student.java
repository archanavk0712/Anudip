package day10;

public class Student 
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return ""+name;
	}
	public static void main(String[] args) 
	{
		Student s1= new Student("abc");
		Student s2= new Student("pqr");
		System.out.println(s1);
		System.out.println(s2);
	}
}
