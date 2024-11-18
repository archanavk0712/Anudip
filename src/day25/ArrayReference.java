package day25;
class Student
{
	int rollno;
	String name;
	int marks;
}
public class ArrayReference
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="abc";
		s1.marks=12;
		Student s2=new Student();
		s2.rollno=2;
		s2.name="xyz";
		s2.marks=23;
		Student s3=new Student();
		s3.rollno=3;
		s3.name="pqr";
		s3.marks=53;
		
		Student students[] /*to hold reference of student object */  =new Student[3]; 
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name +": "+students[i].marks);
		}
	}
}
