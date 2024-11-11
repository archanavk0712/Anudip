package Assignment;
class InsufficientBalance extends RuntimeException
{
	
}
public class AssignmentOnCustomException 
{
	public static void main(String[] args) 
	{		
		int Balance=2000;
		int Withdraw=5000;
		if(Balance>=Withdraw)
		{
			System.out.println("Amount succesfully withdrawn");
		}
		else
		{
			try
			{
				throw new InsufficientBalance();
			//	InsufficientBalance e= new InsufficientBalance();
			//	throw e;
			}
			catch(InsufficientBalance e)
			{
				System.out.println("Insufficient balance"); 
			}
		}
	}
		
}

