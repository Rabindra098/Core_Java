package pack5;

public class ClassO 
{
	int amount=10000;
	synchronized void with_drow(int amount) throws InterruptedException
	{
		if (this.amount<amount) 
		{
			System.out.println("Insufficient Balance");
			//wait(100);
			Thread.sleep(1000);
			this.amount-=amount;
			System.out.println("with drow succefully \nBalance is "+this.amount);
		}
		else 
		{	
			this.amount-=amount;
			System.out.println("with drow succefully \nBalance is "+this.amount);
		}
	}
	synchronized void deposite(int amount) 
	{
		this.amount+=amount;
		System.out.println("Deposite succefully \nBalance is "+this.amount);
		//notify();
		//notifyAll(); 
	}
}
