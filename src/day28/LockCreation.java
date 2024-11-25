package day28;

public class LockCreation 
{
	public void run() throws InterruptedException
	{
		synchronized(this) 
		{
			System.out.println("Main thread is excuting");
			Thread.sleep(5000);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread started");
	
		System.out.println("Main thread is excuting");
		Thread.sleep(5000);
		
		System.out.println("Main thread is excuting");
		Thread.currentThread().interrupt();
		Thread.sleep(5000);
		
		System.out.println("Main thread completed execution");
	}
}