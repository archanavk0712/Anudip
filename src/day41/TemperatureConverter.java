package day41;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class TemperatureConverter extends SimpleArgumentConverter 
{

	@Override
	protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException 
	{
		if(source instanceof String && targetType==Temperature.class)
		{
			String[] parts= ((String) source).split(" ");
			if(parts.length==2)
			{
				double value=Double.parseDouble(parts[0]);
				String unit=parts[1];
				return new Temperature(value,unit);
			}
		}
		throw new ArgumentConversionException("Cannot convert "+source+" to "+targetType);
	}
	
	
}
