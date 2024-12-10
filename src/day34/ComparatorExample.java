package day34;

import java.util.Comparator;
import java.util.TreeSet;

class Student1
{
	int age;
	String name;
	Student1(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}
}

class SortStudentByAge implements Comparator<Student1>
{
	public int compare(Student1 x,Student1 y)
	{
		return x.age-y.age;
	}
}
public class ComparatorExample 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(1,"abc");
		Student1 s2=new Student1(2,"pqr");
		Student1 s3=new Student1(3,"lmn");
		
		SortStudentByAge age=new SortStudentByAge();
		TreeSet<Student1> t=new TreeSet<Student1>(age);
		t.add(s1);
		t.add(s2);
		t.add(s3);
	
		for(Student1 s:t)
		{
			System.out.println(s);
		}
	}
}
