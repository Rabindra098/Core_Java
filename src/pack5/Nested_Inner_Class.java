package pack5;

public class Nested_Inner_Class 
{
	@SuppressWarnings("unused")
	private void meth1()
	{
		System.out.println("Outer class method");
	}
	Nested_Inner_Class()
	{
		System.out.println("Outer class default");
	}
	static
	{
		System.out.println("Outer class static block");
	}
	{
		System.out.println("outer class inner block");
	}
	class InnerClassA
	{
		void msg()
		{
			System.out.println("Inner class method");
			meth1();
		}
		InnerClassA()
		{
			System.out.println("Inner class constructor");
		}
		{
			System.out.println("Inner class instance block");
		}
		static
		{
			System.out.println("Inner class static block");
		}
	}
	public static void main(String[] args) 
	{
		Nested_Inner_Class.InnerClassA iobj = new Nested_Inner_Class().new InnerClassA();
		iobj.msg();
	}
}
