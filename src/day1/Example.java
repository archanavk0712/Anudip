package day1;

public class Example 
{
	public static void main(String[] args) 
	{
		int marks=90;
		if (marks>=0 && marks<=34)
		{
			System.out.println(marks+" is Fail");
		}
		else if(marks>35 && marks<=50)
		{
			System.out.println(marks+" is Second class");
		}
		else if(marks>51 && marks<=80)
		{
			System.out.println(marks+" is First Class");
		}
		else if(marks>81 && marks<=100)
		{
			System.out.println(marks+" is Distinction");
		}
		else
		{
			System.out.println(marks+" is Invalid marks");
		}
	}
}

