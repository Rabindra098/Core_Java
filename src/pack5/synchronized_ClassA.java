package pack5;

public class synchronized_ClassA extends Thread
{
	@Override
	public void run()
	{
		criticalResource();
	}
	synchronized void criticalResource()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+" has entered run()");
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(name+":"+i);
		}
		System.out.println(name+"compleated run() execution");
	}
	public static void main(String[] args) 
	{
		synchronized_ClassA aobj = new synchronized_ClassA();
		
		Thread t1 = new Thread(aobj);
		Thread t2 = new Thread(aobj);
		
		t1.setName("Tom-Thread");
		t2.setName("Jerry-Thread");
		
		t1.start();
		t2.start();
	}
}
