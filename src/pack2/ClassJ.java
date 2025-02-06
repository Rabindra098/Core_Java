package pack2;

public class ClassJ 
{
	void meth1()
	{
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b;
		d=a++;
		c++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	public static void main(String[] args) 
	{
		ClassJ aobj = new ClassJ();
		aobj.meth1();
	}
}
