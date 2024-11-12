// Create an array to store the ages of students belonging to 2 schools and having 3 classrooms and 5 students in each classroom
package day23;
import java.util.Scanner;
public class ThreeDimensionalArray 
{
	public static void main(String[] args) 
	{
		int age[][][]= new int[2][3][5];
		Scanner in = new Scanner(System.in);
		for (int i=0;i<age.length;i++)
		{
			for (int j=0;j<age[i].length;j++)
			{
				for (int k=0;k<age[i][j].length;k++)
				{
					System.out.print("Enter the age of "+k+ "st student from classroom no."+j+" from school "+i+":");
					age[i][j][k]=in.nextInt();
				}
			}
		}
		System.out.println("The ages are:");
		for (int i=0;i<age.length;i++)
		{
			for (int j=0;j<age[i].length;j++)
			{
				for (int k=0;k<age[i][j].length;k++)
				{
					System.out.println(age[i][j][k]);
				}
			}
		}
	}

}
