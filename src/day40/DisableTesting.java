package day40;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class DisableTesting 
{
	@Test
	public void testMethod()
	{
		System.out.println("Disable testing");
	}
	
	@Ignore
	@Test
	public void testMethod1()
	{
		System.out.println("Testing");
	}
	
	public static void main(String[] args) 
	{
		
	}
}
