package day29;

class Family implements Runnable
{
	String resource1="TV";
	String resource2="PlayStation";
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("Rohit")==true)
		{
			rohitAcquiredresource();
		}
		else
		{
			vijayAcquiredresource();
		}
	}
	void rohitAcquiredresource()
	{
		synchronized (resource2)
		{
			try
			{
				System.out.println("Rohit acquired PlayStation");
				Thread.sleep(1000);
				
				synchronized (resource1)
				{
					System.out.println("Rohit acquired TV");
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println("Rohit failed");
			}
		}
	}
	void vijayAcquiredresource()
	{

		synchronized (resource1)
		{
			try
			{
				System.out.println("Vijay acquired TV");
				Thread.sleep(1000);
				
				synchronized (resource2)
				{
					System.out.println("Vijay acquired Playstation");
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println("Vijay failed");
			}
		}
	}
}
public class Deadlock 
{
	public static void main(String[] args) 
	{
		Family f=new Family();
		Thread t1=new Thread(f);
		t1.setName("Rohit");
		t1.start();
		
		Thread t2=new Thread(f);
		t2.setName("Vijay");
		t2.start();
	}
}
