package Mock1;
import java.util.Scanner;
public class TempCelciusToFarenheit 
{
	public static void main(String[] args) 
	{
		int c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius : ");
		c = in.nextInt();
	    double fahrenheit = ((c * 9.0) / 5) + 32;
	    System.out.printf("The temperature in fahrenheit is : " +fahrenheit);
	    in.close();
	}
}

