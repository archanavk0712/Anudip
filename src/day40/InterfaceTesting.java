package day40;

import org.junit.Test;

interface Math1
{
	int add(int a, int b);
	int sub(int a, int b);
	
	default int mul(int a, int b)
	{
		return a*b;
	}
}
public class InterfaceTesting implements Math1
{
	@Test
	@Override
	public int add(int a, int b)
	{
		return a+b;
	}
	
	@Test
	@Override
	public int sub(int a, int b)
	{
		return a-b;
	}	
}
