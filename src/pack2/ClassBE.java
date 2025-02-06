package pack2;

public class ClassBE 
{
	static void meth1()
	{
		System.out.println("meth1() called");
	}
	void meth2()
	{
		ClassBE.meth1();
		System.out.println("meth2() called");
		
	}
	void meth3()
	{
		this.meth2();
		System.out.println("meth3() called");
	}
	void meth4()
	{
		this.meth3();
		System.out.println("meth4() called");
	}
	public static void main(String[] args) 
	{
		new ClassBE().meth4();
		//this.meth4();	//C.E because we cant use 'this' keyword in side a static area.
	}
}
