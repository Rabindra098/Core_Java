package pack1;

public class ClassJ 
{
	void meth1 (int i)
	{
		System.out.println("Hyy");	
		new ClassJ().meth3 (2);
		System.out.println(i/2);
	}
	void meth2 (char c)
	{
		System.out.println("Hellow");
		new ClassJ().meth1 (100);
		System.out.println(c);
	}
	void meth3 (int i)
	{
		System.out.println("Hello World");
		System.out.println(i*i);
	
	}
	public static void main (String [] args)
	{
		System.out.println("Start");
		new ClassJ().meth2 ('A');
		System.out.println("End");
	}
}
