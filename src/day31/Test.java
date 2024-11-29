package day31;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"ABC");
		Student s2=new Student(2,"PQR");
		Student s3=new Student(3,"XYZ");
		Student s4=new Student(4,"LMN");

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student obj:al)
		{
			System.out.println(obj);
			System.out.println("Name: "+obj.name + " Age:"+obj.age);
		}
	}
}
