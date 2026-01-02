package pack4;

public interface InterfaceA 
{

	int i= 10;
	void meth1();
	default void meth2()
	{
		System.out.println("Interface default meth2()");
		this.meth4();
	}
	static void meth3()
	{
		System.out.println("Interface static meth3()");
		//this.meth4(); // C.E because we can not use this keyword inside a static area
	}
	private void meth4()
	{
		System.out.println("Interface private meth4()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Interface main() method");
		InterfaceA.meth3();
	}
}
