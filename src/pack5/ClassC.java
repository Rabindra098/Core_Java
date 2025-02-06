package pack5;

public class ClassC /*extends Thread */ implements Runnable
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
		ClassC aobj = new ClassC();
		Thread t=new Thread(aobj);
		t.start();
	}
}
