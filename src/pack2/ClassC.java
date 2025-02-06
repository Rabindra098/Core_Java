package pack2;

public class ClassC 
{
	public void meth1() 
	{
		System.out.println("meth1() called");
	}
	public ClassC() 
	{
		new ClassC(500).meth1();
		System.out.println("Non-parameterized constructor called");
		new ClassC(100);
	}
	public ClassC(int a)
	{
		System.out.println("parameterized constructor called");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassC aobj = new ClassC();
		aobj.meth1();
		System.out.println("End");
	}
}
