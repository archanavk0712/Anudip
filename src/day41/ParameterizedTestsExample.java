package day41;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestsExample 
{
	static Stream<Object[]> testData()
	{
		return Stream.of(
				new Object[] {1,2,3},
				new Object[] {0,0,0},
				new Object[] {5,-2,3}
				);
	}
	
	@ParameterizedTest
	@MethodSource("testData")
	public void testAddition(int a, int b, int expected)
	{
		int result=Math.add(a, b);
		assertEquals(expected,result);
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4,5})
	void testPositive(int number)
	{
		assertTrue(number>0);
	}
}
