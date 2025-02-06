package pack5;

public class ClassP 
{
	public static void main(String[] args) 
	{	
		ClassO aobj = new ClassO();
		new Thread()	//1st Thread 
		{	//Anononmyous Inner class starts here
			@Override
			public void run()
			{
				try 
				{
					aobj.with_drow(20000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}	//Anononmyous Inner class ends here
		.start();
		new Thread()	//1st Thread 
		{	//Anononmyous Inner class starts here
			@Override
			public void run()
			{
				aobj.deposite(90000);
			}
		}	//Anononmyous Inner class ends here
		.start();
	}
}
