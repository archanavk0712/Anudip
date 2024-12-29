package day41;

public class Temperature 
{
	private double value;
	private String unit;
	
	public Temperature(double value, String unit)
	{
		this.value=value;
		this.unit=unit;
	}

	public double getValue() {
		return value;
	}

	public String getUnit() {
		return unit;
	}
	
}
