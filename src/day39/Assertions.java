package day39;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Assertions 
{
	String message="Good evening";
//  String message="Hello"; will throw an error because expected to output is not achieved
	
	@Test
	public void printMessage()
	{
		System.out.println("Inside the printMeassge()");
		assertEquals(message,"Good evening");
	}
	public static void main(String[] args) 
	{
		Assertions a=new Assertions();
		a.printMessage();
	}

}