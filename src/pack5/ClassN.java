package pack5;

public class ClassN 
{
	public static void main(String[] args) 
	{
		final String A="Java";
		final String B="Python";
		
		Thread t1 = new Thread()
		{	//Anononmyous Inner class starts here
			@Override
			public void run()
			{
				synchronized (A) //Thread 1 is holding Java
				{
					System.out.println("Thread 1 Locked on A");
					try 
					{	
						Thread.sleep(100);
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					synchronized (B) //Thread 1 will be waiting for B (Python)
					{
						System.out.println("Thread 1 Locked on B");
					}
					System.out.println("No dead lock");
				}
			}
		}	//Anononmyous Inner class ends here
		;
		Thread t2 = new Thread()
		{	//Anononmyous Inner class starts here
			@Override
			public void run()
			{
				synchronized (B) //Thread 2 is holding Python
				{
					System.out.println("Thread 2 Locked on B");
					try 
					{	
						Thread.sleep(100);
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					synchronized (A) ////Thread 2 will be waiting for A (Java)
					{
						System.out.println("Thread 2 Locked on A");
					}
					System.out.println("No dead lock");
				}
			}
		}	//Anononmyous Inner class ends here
		;
		t1.start();
		t2.start();
	}
}
