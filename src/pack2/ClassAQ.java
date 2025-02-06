package pack2;

public class ClassAQ 
{
	void meth1(int i)
	{
		System.out.println("-------meth1()-------");
		while (i<=5) 
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("meth1() ececution complited");
	}
	void meth2(int i)
	{
		System.out.println("-------meth2()-------");
		while (i<=10) 
			System.out.println("i value :"+ ++i);
			i++;
		System.out.println("meth2() ececution complited");
	}
	void meth3(int i)
	{
		System.out.println("-------meth3()-------");
		while (i<=10)
		{
			System.out.println("i value :"+i++ +" "+ ++i);
			//System.out.println("i value :"+i++ + ++i);
		}
		System.out.println("meth3() ececution complited");
	}
	void meth4(int i)
	{
		System.out.println("-------meth4()-------");
		while (i<=5) 
		//	int x=50;		//C.E  because we cant write any directive statements 
			System.out.println("i value :"+i);
			i++;
		System.out.println("meth4() ececution complited");
	}
	void meth5(int i)
	{
		System.out.println("-------meth5()-------");
		while (true) 
		{
			System.out.println("i value :"+i);
			i++;
		}
		//System.out.println("meth5() ececution complited");
	}
	void meth6(int i)
	{
		System.out.println("-------meth6()-------");
		do 
		{
			System.out.println("i value :"+i);
			i++;
		}
		while (i<=5);
		System.out.println("meth6() ececution complited");
	}
	public static void main(String[] args) 
	{
		ClassAQ aobj = new ClassAQ();
		//aobj.meth1(1);
//		aobj.meth2(1);
//		aobj.meth3(1);
		aobj.meth4(1);
//		aobj.meth5(1);
//		aobj.meth6(100);
		
	}
}
