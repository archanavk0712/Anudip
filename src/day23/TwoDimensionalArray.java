//create an array to store ages of students belonging to two class rooms, 5 students in each classroom
package day23;
import java.util.Scanner;
public class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		int age[][]=new int[2][5];
		Scanner in= new Scanner(System.in);
		for(int i=0;i<age.length;i++)  //classroom
		{
			for(int j=0;j<age[i].length;j++)  //students
			{
				System.out.print("Enter the agge of class "+i+" Student "+j+ ":");
				age[i][j]=in.nextInt();
			}
		}
		System.out.println("The ages are:");
		for(int i=0;i<age.length;i++)  //classroom
		{
			for(int j=0;j<age[i].length;j++)  //student
			{
				System.out.println(age[i][j]);
			}
		}
	}
}
