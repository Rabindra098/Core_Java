package pack1;

public class ClassAD 
{
	void meth1()
	{
		System.out.println("meth1() calling");
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		return;
	}
	int meth2()
	{
		System.out.println("meth2() calling");
		return 100;
		//System.out.println("hello world"); C.E  because it is unrechable code
	}
	int meth3(int x)
	{
		System.out.println("meth3() calling");
		System.out.println("x value is :"+x);
		System.out.println("int & char both compatable datatype");
		return 'a'+3;
	}
	ClassAD meth4()
	{
		System.out.println("meth4() calling");
		return new ClassAD();
	}
	int meth5(int i)
	{
		System.out.println("meth5() calling");
		if (i<=10) 
		{
			System.out.println("if block executed");
			return 100;
			//System.out.println("hyy"); C.E  because it is unrechable code
		} 
		else 
		{
			System.out.println("else block executed");
			return 1000;
			//System.out.println("java"); C.E  because it is unrechable code
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassAD aobj = new ClassAD();
		aobj.meth1();
		System.out.println("meth2() returning :"+ aobj.meth2());
		System.out.println("meth3() returning :"+ aobj.meth3('a'));
		System.out.println("meth4() returning :"+ aobj.meth4());
		System.out.println("meth5() returning :"+ aobj.meth5(5));
		System.out.println("End");
	}
}
