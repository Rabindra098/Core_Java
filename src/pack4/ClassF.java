package pack4;

public class ClassF extends ClassE 
{
	void msg()
	{
		System.out.println("ClassF msg() called");
		super.meth1();
	}
	ClassF() 
	{
		super();
		super.meth1();
		System.out.println("ClassF default constructer");
	}
	ClassF(int y)
	{
		super(999);
		System.out.println("ClassE parameter constructer :"+y);
	}
	public static void main(String[] args) 
	{
		ClassF fobj1 = new ClassF();
		ClassF fobj2 = new ClassF(1000);
		fobj1.msg();
		//super.meth1() //C.E  because we cant use 'super' keyword inside static area
	}
}
