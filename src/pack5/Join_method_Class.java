//join() method Class-G
package pack5;

public class Join_method_Class 
{
	public static void main(String[] args) throws InterruptedException
	{
		Join_thread_Class aobj = new Join_thread_Class();
		aobj.start();
		
		aobj.join();
		
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Class-G main() : "+i);
		}
	}
}
