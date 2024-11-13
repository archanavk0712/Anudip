package Assignment;
import java.util.Scanner;
public class JaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int age[][][]= new int[2][][];  //2 schools
		age[0]=new int[3][];  //1st school, 3 classrooms
		age[0][0]=new int[3];  //1st school, 1st classroom, 3students
		age[0][1]=new int[4];  //1st school, 2nd classroom, 4students
		age[0][2]=new int[5];  //1st school, 3rd classroom, 5students
		
		age[1]=new int[2][];  //2nd school, 2 classrooms
		age[1][0]=new int[3];  //2nd school, 1st classroom, 3students
		age[1][1]=new int[4];  //2nd school, 2nd classroom, 4students
		
		for(int i=0;i<age.length;i++)  //school
		{
			for(int j=0;j<age[i].length;j++)  //classroom
			{
				for(int k=0;k<age[i][j].length;k++)  //students
				{
					System.out.print("The age of "+k+" student of "+j+" classroom from "+i+" school is: ");
					age[i][j][k]=in.nextInt();
				}
			}
		}
		System.out.println("The ages are:");
		for(int i=0;i<age.length;i++)  //school
		{
			for(int j=0;j<age[i].length;j++)  //classroom
			{
				for(int k=0;k<age[i].length;k++)  //students
				{
					System.out.println(age[i][j][k]);
				}
			}
		}
		
	}
}
