package pack5;

public class ThreadGroupTest implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		ThreadGroupTest robj = new ThreadGroupTest();//Class object
		
		synchronized (robj) 
		{
			ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
			tg.setMaxPriority(10);
			
			Thread t1 = new Thread(tg,robj,"One");
			t1.start();
			
			Thread t2 = new Thread(tg,robj,"Two");
			t2.start();
			
			Thread t3 = new Thread(tg,robj,"Three");
			t3.start();
			
			System.out.println("Active Thread :"+tg.activeCount());
			System.out.println("ThreadGroup Name :"+tg.getName());
		}
	}
}
