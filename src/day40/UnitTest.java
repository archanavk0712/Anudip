package day40;

import static org.junit.Assert.assertEquals;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class UnitTest 
{
	@Test
	public void testAddition()
	{
		int result = Math.add(2, 5);
		assertEquals(7,result);
	}
	
	@Ignore
	@Test
	public void testSubtraction()
	{
		int result=Math.sub(3, 5);
		assertEquals(-2,result);
	}
}
