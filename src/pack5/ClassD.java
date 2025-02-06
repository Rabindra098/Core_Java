package pack5;

public class ClassD extends Thread
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
		ClassD aobj = new ClassD();
		Thread t1 = new Thread(aobj);
		//t1.start();
		/*
		 	A new Thread will be getting create and that new Thread is responsible 
		 	for running the run() which is ClassD (Because of overridding)
		*/
		//t1.run();
		/*
		 	No new Thread will created ClassD run() method will be getting 
		 	executed because of Overriding concept 
		 */
		Thread t2 = new Thread();
		t2.start();
		/*
		 	A new Thread will be getting create and that new Thread is responsible 
		 	for running the run() which is present in Thread Class 
		*/
		t2.run();
		/*
		 	No new Thread will created ClassD run() method will be getting 
		 	executed just like a NORMAL METHOD CALL
		*/
		
	}
}
