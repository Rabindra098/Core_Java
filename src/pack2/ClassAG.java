package pack2;

public class ClassAG 
{
	//1)(i) WAP Take a parameterized constructor with two int values and print greatest among them.
	void meth1(int x,int y)
	{
		if (x>y) 
		{
			System.out.println(x+" is greater");
		}
		else 
		{
			System.out.println(x+" is samller");
		}
	}
	//(ii) WAP Take a parameterized constructor with tharee int values and print greatest among them.

	void meth2(int x,int y,int z)
	{
		if (x>y) 
		{
			if (x>z) 
			{
				System.out.println(x+" is bigger");
			}
			else 
			{
				System.out.println(z+" is bigger");
			}
		}
		else
		{
			if (y>z) 
			{
				System.out.println(y+" is bigger");
			}
			else 
			{
				System.out.println(z+" is bigger");
			}
		}
	}
	public static void main(String[] args) 
	{
		ClassAG aobj = new ClassAG();
		aobj.meth1(40,90);
		aobj.meth2(0,9000,300);
	}
}
