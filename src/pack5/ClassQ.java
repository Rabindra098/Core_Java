package pack5;

public class ClassQ extends Thread
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
		ClassQ aobj = new ClassQ();
		Thread t=new Thread(aobj);
		//t.setDaemon(true);
		t.start();
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println("main() "+i);
		}
	}
}
