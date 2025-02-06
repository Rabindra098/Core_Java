package pack4;

public class ClassP implements InterfaceC,InterfaceD
{
	@Override
	public void meth1()
	{
		InterfaceC.super.meth1();
		InterfaceD.super.meth1();
	}
	public static void main(String[] args) 
	{
		ClassP aobj = new ClassP();
		aobj.meth1();
	}
}
