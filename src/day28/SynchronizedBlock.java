package day28;
class Printer implements Runnable
{
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" started printing");
		for(int i=1;i<=3;i++)
		{
			System.out.println(name+" is printing");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Problem occured !!");
			}
		}
		System.out.println(name+" completed printing");
	}
}
public class SynchronizedBlock
{
	public static void main(String[] args) throws InterruptedException
	{
		Printer p= new Printer();
		Thread t1=new Thread(p);
		t1.setName("abc");
		t1.start();
		Thread t2=new Thread(p);
		t2.setName("pqr");
		t2.start();
		Thread t3=new Thread(p);
		t3.setName("xyz");
		t3.start();
	}
}
