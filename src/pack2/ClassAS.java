package pack2;

public class ClassAS 
{
	void meth1(int x,int y)
	{
		for (;x<=y;x++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(x+"*"+i+"="+(x*i));
			}
			System.out.println("-----------------");
		}
	}
	void meth2()
	{

		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
	static int x=1;
	void meth3()
	{
		if(x<=100) 
		{
			System.out.println(x++);
			new ClassAS().meth3();
		}
	}
	void meth4(int x,int y)
	{
		int count=0;
		for (;x<y;x++)
		{
			if(x%2==0)
			{
				System.out.println(x +" is even");
				count++;
			}
		}
		System.out.println("There are "+count+" even number");
		
	}
	void meth5(int x)
	{
		int fact=1;
		for(;x>=1;x--)
		{
			fact=fact*x;
		}
		System.out.println("Factorial "+fact);
	}
	public static void main(String[] args) 
	{
		ClassAS aobj = new ClassAS();
		//aobj.meth1(1,5);
		//aobj.meth2();
		//new ClassAS().meth3();
		//aobj.meth4(1, 175);
		aobj.meth5(5);
	}
}
