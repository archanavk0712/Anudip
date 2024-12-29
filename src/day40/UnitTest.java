package day40;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assumptions;


public class UnitTest 
{
	@Test
	public void testAddition()
	{
		int a=ThreadLocalRandom.current().nextInt();
		int b=ThreadLocalRandom.current().nextInt();
		int result = Math.add(a,b);
		assertEquals(a+b,result);
		
		int additionResult=Math.add(a, b);
		Assumptions.assumeTrue(a+b==additionResult);
	}
	
	@Ignore
	@Test
	public void testSubtraction()
	{
		int result=Math.sub(3, 5);
		assertEquals(-2,result);
	}
}
