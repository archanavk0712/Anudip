package day41;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTests 
{
	@TestFactory
	Stream<DynamicTest> dynamicTestStream()
	{
		return Stream.of(
				dynamicTest("Test1",() -> assertEquals(20,Math.add(5,2))),
				dynamicTest("Test1",() -> assertEquals(20,Math.sub(5,2)))
				);
	}
}
