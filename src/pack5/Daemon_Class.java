package pack5;

public class Daemon_Class extends Thread
{
	public void run()
	{
		int i=1;
		while (true) 
		{
			System.out.println("Thread :"+i++);
		}
	}
	public static void main(String[] args) 
	{
		Daemon_Class aobj = new Daemon_Class();
		Thread t=new Thread(aobj);
		//t.setDaemon(true);
		t.start();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("main() "+i);
		}
	}
}
