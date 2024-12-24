package day39;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Annotations 
{
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("BeforeAll-->Executed once before all test methods in this class");
	}
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("BeforeEach-->Executed once before each test methods in this class");
	}
	
	@Test
	void testMethod()
	{
		System.out.println("Test method executed");
	}
	
	@DisplayName("Test method with condition")
	
	@Test
	void testMethod1()
	{
		System.out.println("Test method1 executed");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println("Executed after each test method in this class");
	}
	
	@AfterAll
	static void afterAll()
	{
		System.out.println("Executed after all methods in this class");
	}
	public static void main(String[] args) 
	{
	
	}
}
