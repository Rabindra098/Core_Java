package pack2;

public class ClassAR
{
	void meth1()
	{
		System.out.println("--------meth1()----------");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value:"+i);
		}
		System.out.println("meth1() execution complited");
	}
	void meth2()
	{
		System.out.println("--------meth2()----------");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.println("i :"+i+" "+"j :"+j);
			}
			System.out.println("-------------------");
		}
		System.out.println("meth2() execution complited");
	}
	void meth3()
	{
		System.out.println("----------meth3()-----------");
		int i=1;
		for(;i<=5;)
			//int x=10 //C.E because we are cant write any declarative statement int this line
			System.out.println("i value :"+i);
			i++;
		System.out.println("meth3 () execution complited");	
	}
	void meth4()
	{
		System.out.println("----------meth4()-----------");
		for(int i=1;i<=10;i++)
				System.out.println("i value :"+ ++i+" "+ ++i);
		System.out.println("meth2() execution complited");
	}
	void meth5()
	{
		System.out.println("--------meth5()----------");
		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		System.out.println("meth2() execution complited");
	}
	void meth6()
	{
		System.out.println("--------meth6()----------");
		int i=1;
		for(System.out.println("-----meth6"),System.out.println("-----");i<=3;System.out.println(new ClassAR().meth7()))
		{
			System.out.println("i value :"+ i++);
		}
		System.out.println("meth6() execution complited");
	}
	String meth7()
	{
		System.out.println("meth6() executed");
		return "java is awesome";
	}
	void meth8()
	{
		System.out.println("--------meth7()----------");
		int i=1;
		for(;;)
		{
			System.out.println("i value :"+ i++);
		}
		//System.out.println("meth6() execution complited");
	}
	public static void main (String [] args)
	{
		ClassAR aobj=new ClassAR();
		aobj.meth1();
		aobj.meth2();
		aobj.meth3();
		aobj.meth4();
		aobj.meth5();
		aobj.meth3();
		aobj.meth6();
		aobj.meth8();
	}
}