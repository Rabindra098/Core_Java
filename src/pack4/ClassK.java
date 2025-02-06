package pack4;

public class ClassK extends ClassJ
{
	@Override
	public void meth1()
	{
		System.out.println(10);
	}
	@Override
	public int meth2(int num)
	{
		System.out.println(20);
		return 999;
	}
	@Override
	protected void meth3(int i,String s)
	{
		System.out.println(30);
	}
	//@Override   //C.E
	static void meth4()
	{
		System.out.println(40);
	}
	@Override
	ClassK meth5()
	{
		System.out.println(50);
		return new ClassK();
	}
	public static void main(String[] args) 
	{
		ClassJ aobj1 = new ClassJ();
		aobj1.meth1();
		
		System.out.println("----------------");
		
		ClassK aobj2 = new ClassK();
		aobj2.meth1();
		aobj2.meth2(99);
		aobj2.meth3(100, "Rabi");
		aobj2.meth4();
		aobj2.meth5();
	}
}
