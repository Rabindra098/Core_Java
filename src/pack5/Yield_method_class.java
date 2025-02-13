//yield() method Class-K
package pack5;

public class Yield_method_class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Yield_thread_Class aobj = new Yield_thread_Class();
		aobj.start();
		
		aobj.join();
		Thread.yield();
		
		for (int i = 1; i <= 5 ; i++) 
		{
			System.out.println("Class-K main() : "+i);
		}
	}
}
