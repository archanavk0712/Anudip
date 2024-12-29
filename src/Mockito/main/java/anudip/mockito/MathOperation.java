package anudip.mockito;
interface CalculatorService
{
	public double add(double input1, double input2);
	public double subtract(double input1, double input2);
	public double multiply(double input1, double input2);
	public double division(double input1, double input2);
}

public class MathOperation implements CalculatorService 
{
	private CalculatorService calcService;
	
	public void setCalculatorService(CalculatorService calcService)
	{
		this.calcService=calcService;
	}
	
	public double add(double input1, double input2)
	{
		return calcService.add(input1, input2);
	}
	
	public double subtract(double input1, double input2)
	{
		return calcService.subtract(input1, input2);
	}
	
	public double multiply(double input1, double input2)
	{
		return calcService.multiply(input1, input2);
	}
	
	public double division(double input1, double input2)
	{
		return calcService.division(input1, input2);
	}
}

