package pack2;

public class ClassBG 
{
	void meth1()
	{
		System.out.println("java is awesome!!");
	}
	ClassBG()
	{
		this(100);
		this.meth1();
		System.out.println("default constructor");
	}
	ClassBG(int x)
	{
		System.out.println("parameterized constructor x :"+x);
	}
	public static void main(String[] args) 
	{
		new ClassBG();
	}
}
