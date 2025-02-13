package pack5;

public class Thread_Class implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i <= 5; i++) 
		{
			System.out.println("i value : "+i);
		}
	}
	public static void main(String[] args) 
	{
		Thread_Class aobj = new Thread_Class();
		Thread t=new Thread(aobj);
		t.start();
	}
}
