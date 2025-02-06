package pack2;

public class ClassL 
{
	void meth1(int a,int b,int c)
	{
		System.out.println("Addition :"+(a+b+c));
		new ClassL().meth2(30, 40);
	}
	void meth2(int a,int b)
	{
		System.out.println("Substraction :"+(a-b));
	}
	ClassL()
	{
		System.out.println("Multipliction :"+(10*2));
	}
	ClassL(int a)
	{
		System.out.println("Division :"+(a/2));
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		new ClassL(10).meth1(10, 20, 30);
		System.out.println("End");
	}
}
