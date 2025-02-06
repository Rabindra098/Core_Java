package pack5;

public class ClassE extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for (int i = 0; i <= 10;i++) 
		{
			System.out.println(name+"("+priority+") Execute run() :"+i);
		}
	}
	public static void main(String[] args) 
	{
		ClassE aobj = new ClassE();
		
		Thread t1=new Thread(aobj);
		Thread t2=new Thread(aobj);
		
		t1.setName("First Thread");
		t2.setName("second Thread");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
/*
  	Thread-Sehedular:
  	-> Thread sehedular is going to decide which thread should execute first 
  	   basing upon '2' aspects
  	   		--> Thread Priorities
  	   		--> Underlying OS
  	   	Thread Priorities :
  	   		--> Minimum Priority : 1
  	   		--> Normal/Default priority : 5
  	   		--> Maximum priority
*/
