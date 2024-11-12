//create an array to store ages of 5 students belonging to a class rooms
package day23;
import java.util.Scanner;
public class OneDimensionalArray 
{
	public static void main(String[] args) 
	{		
		int a[]=new int[5];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the age:");
			a[i]=in.nextInt();
		}
	}
}
