package day8;
import java.util.Scanner;
public class UserInput 
{
	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the first number:");
	float a=in.nextFloat();
	System.out.print("Enter the second number:");
	int b=in.nextInt();
	float c= a+b;
	System.out.print("The sume of "+a+" and "+b+" is "+c);
	in.close();
	}
}
