//yield() method Class-J
package pack5;

public class Yield_thread_Class extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Yield method Executed");
		for (int i = 1; i <= 5 ; i++) 
		{
			System.out.println("Class-J :"+i);
		}
	}
}
