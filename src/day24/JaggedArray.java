/* Create array to store the ages of students belonging to 2 classrooms 
where the 1st classroom has 2 students and 2nd classroom has 5 students*/
package day24;
import java.util.Scanner;
public class JaggedArray 
{
	public static void main(String[] args) 
	{
		int age[][]=new int[2][];
		//when not sure about how many students are in each of two class 
		//then just leave it blank and specify separately
		age[0]=new int[2];  //separately specifying no. of students in 1st classroom
		age[1]=new int[5];  //separately specifying no. of students in 2st classroom
		Scanner in=new Scanner(System.in);
		for(int i=0;i<age.length;i++)  //classroom
		{
			for(int j=0;j<age[i].length;j++)  //student
			{
				System.out.print("Enter the age of "+j+" student of "+i+" classroom: ");
				age[i][j]=in.nextInt();
			}
		}
		System.out.println("The ages are: ");
		for(int i=0;i<age.length;i++)  //classroom
		{
			for(int j=0;j<age[i].length;j++)  //student
			{
				System.out.println(age[i][j]);
			}
		}
	}
}
