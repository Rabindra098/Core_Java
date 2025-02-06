//yield() method Class-K
package pack5;

public class ClassK 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ClassJ aobj = new ClassJ();
		aobj.start();
		
		aobj.join();
		Thread.yield();
		
		for (int i = 1; i <= 5 ; i++) 
		{
			System.out.println("Class-K main() : "+i);
		}
	}
}
