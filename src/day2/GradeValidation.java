package day2;

public class GradeValidation 
{
	public static void main(String[] args) 
	{
		char grade= 'g';
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent!");
		  	break;
		case 'B': 
			System.out.println("Try harder");
	  	break;
		case 'C': 
			System.out.println("Can do better");
	  	break;
		case 'D': 
			System.out.println("Needs a lot of improvement");
	  	break;
		default: System.out.println("Invalid Grade");
		break;
		}
	}

}


