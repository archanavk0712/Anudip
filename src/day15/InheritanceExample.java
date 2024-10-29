package day15;
class CreditCard  //parent class
{
	int cardNo=123456789;
	int pinNo=9999;
}
class Hacker extends CreditCard  //child class
{
	void viewDetails()
	{
		System.out.println("Card Number:"+cardNo);
		System.out.println("Pin Number:"+pinNo);
	}
	void changeDetails()
	{
		cardNo=234567891;
		pinNo=1111;
	}
}
public class InheritanceExample 
{
	public static void main(String[] args) 
	{
	Hacker h= new Hacker();
	h.viewDetails();
	h.changeDetails();
	h.viewDetails();
	}
}
