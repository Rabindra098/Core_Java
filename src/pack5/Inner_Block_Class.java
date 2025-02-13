package pack5;

public class Inner_Block_Class 
{
	void meth1()
	{
		System.out.println("Instance method");
	}
	static void meth2()
	{
		System.out.println("Static method");
	}
	public Inner_Block_Class() 
	{
		System.out.println("Default constructor");
	}
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("Inner block");
	}
	public static void main(String[] args) 
	{
		Inner_Block_Class ibc =new Inner_Block_Class();
		ibc.meth1();
		Inner_Block_Class.meth2();
	}
}
