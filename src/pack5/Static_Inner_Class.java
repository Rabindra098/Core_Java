package pack5;

public class Static_Inner_Class 
{
	int x=10;
	static int y=20;
	Static_Inner_Class()
	{
		System.out.println("Outer Class constructor");
	}
	static
	{
		System.out.println("outer static block ");
	}
	{
		System.out.println("outer instance block");
	}
	static class InnerClassA
	{
		void msg()
		{
			System.out.println("Inner Class method");
			System.out.println("Outer class Instance Variable :"+new Static_Inner_Class().x);
			System.err.println("outer class static variable :"+y);
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
		public static void main(String[] args) 
		{
			InnerClassA ic = new InnerClassA();
			ic.msg();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Outer class main()");
		Static_Inner_Class.InnerClassA stc = new Static_Inner_Class.InnerClassA();
		stc.msg();
		
	}
}
