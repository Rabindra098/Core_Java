package pack4;

public class ClassH extends ClassG
{
	void display()
	{
		System.out.println("Hi");
		super.meth4();
	}
	static int show (int a)
	{
		System.out.println(a+a);
		return a + a++;
	}
	ClassH()
	{
		this(show(50));
		for (int i=10;;i++)
		{
			super.meth4();
			break;
		}
	}
	ClassH(int a)
	{
		System.out.println("==>"+a++ + show(50));
	}
	public static void main(String[] args) 
	{
		new ClassH().display();
	}
}
