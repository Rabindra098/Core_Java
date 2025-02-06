package pack2;

public class ClassAW 
{
	void meth1()
	{
		System.out.println("meth1() called ");
		for (int i=0; i<=10; i++) 
		{
			if (i==5) 
			{
				//break;
				//continue;
				return;
			}
			System.out.println("i value :"+i);
		}
		System.out.println("Compiler came out from for loop");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		ClassAW aobj = new ClassAW();
		aobj.meth1();
		System.out.println("End");
	}
}
