//sleep() method
package pack5;

public class Sleep_method_Class
{	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("J");
		Thread.sleep(10000);	//10000 M.s
		System.out.println("a");
		Thread.sleep(5000);		//5000 M.s
		System.out.println("v");
		Thread.sleep(5000,500);	
		System.out.println("a");
	}
}
