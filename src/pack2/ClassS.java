package pack2;

public class ClassS 
{
	static int i=ClassS.meth1();
	//static int i=500;
	static int meth1()
	{
		System.out.println("meth1() called");
		ClassS t1 = new ClassS();
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("main() called :"+i);
	}
	static
	{
		System.out.println("static block called :"+i);
	}
}
