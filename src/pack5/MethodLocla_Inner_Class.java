package pack5;

public class MethodLocla_Inner_Class 
{
	void meth1()
	{
		String s="java";
		@SuppressWarnings("unused")
		class InnerClassA
		{
			void msg1()
			{
				System.out.println(s.concat(" is awesome!!!\n"));
			}
		}
		@SuppressWarnings("unused")
		class InnerClassB
		{
			void msg2()
			{
				System.out.println(s.concat(" is amazing!!!"));
			}
		}
		new InnerClassA().msg1();
		new InnerClassB().msg2();
	}
	public static void main(String[] args) 
	{
		new MethodLocla_Inner_Class().meth1();
	}
}
