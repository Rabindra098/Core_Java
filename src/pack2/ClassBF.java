package pack2;

public class ClassBF 
{
	ClassBF meth1()
	{
		System.out.println("meth1() called");
		return this;
	}
	ClassBF meth2()
	{
		System.out.println("meth2() called");
		return this;
	}
	void meth3()
	{
		System.out.println("meth3() called");
		return;
	}
	public static void main(String[] args) 
	{
		new ClassBF().meth1().meth2().meth3();  	//Method Chaining
	}
}
