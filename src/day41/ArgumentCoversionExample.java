package day41;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentCoversionExample 
{
	@ParameterizedTest
	@ValueSource(strings= {"0 Celsius", "32 Fahrenheit","100 Kelvin "})
	void testTemperatureConversion(@ConvertWith(TemperatureConverter.class) Temperature temp)
	{
		double value = temp.getValue();
		String unit=temp.getUnit();
		
		if("Celcius".equals(unit))
		{
			assertEquals(0,0,value);
		}
		else if("Fahrenheit".equals(unit))
		{
			assertEquals(32.0,value);
		}
		else if("Kelvin".equals(unit))
		{
			assertEquals(100.0,value);
		}
	}
}
