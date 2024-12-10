package day34;

import java.util.TreeSet;

class Student implements Comparable<Student>
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name);
	}
}
public class SortStudent 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"abc");
		Student s2=new Student(2,"pqr");
		Student s3=new Student(3,"lmn");
		
		TreeSet<Student> t =new TreeSet<>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(Student obj:t)
		{
			System.out.println(obj);
		}
	}
}
