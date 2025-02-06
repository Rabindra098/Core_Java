//join() method Class-f
package pack5;

public class ClassF extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <= 5;i++) 
		{
			System.out.println("Class-F : "+i);
		}
	}
}
