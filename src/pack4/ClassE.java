package pack4;

public class ClassE 
{
	void meth1()
	{
		System.out.println("ClassE meth1() called");
	}
	ClassE()
	{
		this(100);
		this.meth1();
		System.out.println("ClassE default constructer");
	}
	ClassE(int x)
	{
		System.out.println("ClassE parameter constructer :"+x);
	}
	
}
