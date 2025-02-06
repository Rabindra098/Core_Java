//join() method Class-G
package pack5;

public class ClassG 
{
	public static void main(String[] args) throws InterruptedException
	{
		ClassF aobj = new ClassF();
		aobj.start();
		
		aobj.join();
		
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("Class-G main() : "+i);
		}
	}
}
