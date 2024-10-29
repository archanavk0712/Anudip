package day9;
class Student
{
	String name;
	int marks;
}
public class StudentDetails 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		Student s1=new Student();
		System.out.println(s.name+" "+s.marks);
		System.out.println(s1.name+" "+s1.marks);
	}

}

