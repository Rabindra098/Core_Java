package pack2;

public class ClassAF 
{
	void meth1(int i)	//i=97
	{
		System.out.println("-------meth1()--------");
		if (!(i<='A')) 
		{
			System.out.println("if block executed");
		}
		System.out.println("meth1() executio complited");
	}
	void meth2(int i) 
	{
		System.out.println("-------meth2()--------");
		if (i<=5) 
			//int x=100;	//C.E because should not writing declerative statements in this line 
			System.out.println("if block executed");
			System.out.println("meth2() executio complited");
	}
	void meth3(int i,int num)
	{
		System.out.println("-------meth3()--------");
		if  (i<=5)
		{
			if (num%2==0) 
			{
				System.out.println(num+"is even");
			}
			else 
			{
				System.out.println(num+"is odd");
			}
		}
		System.out.println("meth3() executio complited");
	}
	void meth4(int i)
	{
		System.out.println("-------meth4()--------");
		if (i<5) 
		{
			System.out.println("if block executed");
			System.out.println("hyy");
		}
		else
			System.out.println("else block executed");
			System.out.println("hello");
		System.out.println("meth4() executio complited");
	}
	void meth5(int i) 
	{
		System.out.println("-------meth5()--------");
		if (false) 
		{
			System.out.println("if block executed");
		}
		else  
		{
			System.out.println("else block executed");
		}
		System.out.println("meth5() executio complited");

	}
	void meth6(int num)
	{
		System.out.println("-------meth6()--------");
		if (num>0) 
		{
			System.out.println(num+" is positive");
		}
		else if (num<0) 
		{
			System.out.println(num+" is negetive");
		}
		else 
		{
			System.out.println(num+" is equal to Zero");
		}
		System.out.println("meth6() executio complited");
	}
	public static void main(String[] args) 
	{
		ClassAF aobj = new ClassAF();
		aobj.meth1('a');
		aobj.meth2(50);
		aobj.meth3(1, 5);
		aobj.meth4(1);
		aobj.meth5(1000);
		aobj.meth6(10);
	}

}
