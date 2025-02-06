package pack1;

public class ClassE 
{
	void meth1()
	{
		int i =10;
		ClassE aobj=new ClassE();
		aobj.meth2();
		System.out.println(i+90);
	}
	void meth2()
	{
		int x= 1000;
		System.out.println(x-1);
	}
	public static void main(String[] args) 
	{
		ClassE aobj = new ClassE();
		aobj.meth1();
	}
	
}
