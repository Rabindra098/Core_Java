//interrupt() method
package pack5;

public class Interrput_method_Class extends Thread
{
	@Override
	public void run()
	{
		System.out.println("I am ready for interview");
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("This is my "+i+" interview");
		}
		System.out.println("I got placed now i can relax");
		try 
		{
			Thread.sleep(20000);
		} 
		catch (Exception e) 
		{
			System.out.println("My sleep got disturbed");
		}
		System.out.println("Time to go to office");
	}
	public static void main(String[] args) 
	{
		Interrput_method_Class aobj = new Interrput_method_Class();
		Thread t = new Thread(aobj);
		t.start();
		t.interrupt();
	}
}
