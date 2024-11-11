package Assignment;

class Brain
{
	private int weight;
	private String color;
	Brain(int weight,String color)
	{
		this.weight=weight;
		this.color=color;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
}
class Book
{
	private String name;
	private String author;
	Book(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
	public String getName(){
		return name;
	}
	public String getAuthor(){
		return author;
	}
}
class Student
{
	Brain b=new Brain(125,"pink");
	void hasA(Book bb)
	{
		System.out.println(bb.getName());
		System.out.println(bb.getAuthor());
	}
}
public class AssignmentOnAggregationAndComposition 
{
	public static void main(String[] args) 
	{
		Book bb =new Book("English","Shakesphere");
		Student s= new Student();
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		s.hasA(bb);
	}

}
