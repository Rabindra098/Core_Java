package pack4;

public class ClassM extends ClassL
{
	@Override
	public void meth1()
	{
		System.out.println("ClassM meth1() called");
	}
	@Override
	String msg(int num)
	{
		System.out.println("ClassM meg() called");
		return "I love Java";
	}
	static
	{
		System.out.println("ClassM static block called");
	}
	public static void main(String[] args) 
	{
		ClassL aobj = new ClassM();
		aobj.meth1();
		aobj.msg(100);
		aobj.meth2();
	}
	
}
