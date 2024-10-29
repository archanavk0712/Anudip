package day2;

public class NestedIf
{
	public static void main(String[] args) 
	{
		String UserId="abc";
		String Password="lmn";
		if(UserId=="abc")
		{
			if(Password=="km")
			{
				System.out.println("User Logged In");
			}
			else 
			{
				System.out.println("Incorrect Password");
			}
		}
		else
		{
			System.out.println("Invalid UserId and Password");
		}

	}

}
