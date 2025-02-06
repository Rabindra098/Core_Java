package pack1;

public class first 
{
	int meth1(int x)
	{
		System.out.println("hyy");
		System.out.println(x);
		return 50;
	}
	public static void main(String[] args) 
	{
		System.out.println("hello world");
		System.out.println(100);
		first aobj = new first();
		aobj.meth1(30);
	}
}
