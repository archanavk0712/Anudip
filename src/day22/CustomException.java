package day22;
class InvalidPasswordException extends RuntimeException
{
	 
}
public class CustomException 
{
	public static void main(String[] args) 
	{		
		String id="Admin";
		int password=1245;
		if(id.equals("Admin"))
		{
			if(password==12345)
			{
				System.out.println("Login Successful");
			}
			else
			{
				try
				{
				InvalidPasswordException e = new InvalidPasswordException();
				throw e;
				}
				catch(InvalidPasswordException e)
				{
					System.out.println("Invalid id and password");
					System.out.println("Login Unsuccessful!!");
				}
			}
		}
	}
}
