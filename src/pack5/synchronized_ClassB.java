package pack5;

public class synchronized_ClassB extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" has entered run()");
		synchronized(this)
		{
			for (int i = 1; i <= 5; i++) 
			{
				System.out.println(name+":"+i);
			}
		}
		System.out.println(name+"compleated run() execution");
	}
	public static void main(String[] args) 
	{
		synchronized_ClassB aobj = new synchronized_ClassB();
		
		Thread t1 = new Thread(aobj);
		Thread t2 = new Thread(aobj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.start();
		t2.start();
	}
}