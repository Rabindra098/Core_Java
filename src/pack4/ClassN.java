package pack4;

public class ClassN extends ClassO implements  InterfaceA,InterfaceB
{
	@Override
	public void meth1()
	{
		System.out.println("ClassN public meth1()");
	}
	@Override
	public void greeting()
	{
		System.out.println("Happy New Year 2025");
	}
	@Override
	protected void meth()
	{
		System.out.println("I love java");
	}
	public static void main(String[] args) 
	{
		InterfaceA aobj = new ClassN();
		aobj.meth1();
		aobj.meth2();
		//aobj.meth4();	//C.E because of private class access modifier
		
		InterfaceB	aobj1=new ClassN();
		aobj1.greeting();
		
		new ClassN().meth();
	}
}
