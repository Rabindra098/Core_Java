package pack5;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo extends Thread
{
	private String msg;
	public ThreadPoolDemo(String s)
	{
		this.msg=s;
	}
	@Override
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Begining) message= "+msg);
		ProcessMessage();
		System.out.println(Thread.currentThread().getName()+"(Ending)");
		ProcessMessage();
	}
	private void ProcessMessage()
	{
		try 
		{	
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		ExecutorService excuter = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 5;i++) //
		{
			ThreadPoolDemo tpdobj = new ThreadPoolDemo(" "+i);
			Thread t = new Thread(tpdobj);
			excuter.execute(t);
		}
		excuter.shutdown();
		while (!excuter.isTerminated()) 
		{
			
		}
		System.out.println("Finished all Thread");
	}
}
