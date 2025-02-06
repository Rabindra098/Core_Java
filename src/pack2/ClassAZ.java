package pack2;

public class ClassAZ 
{
	String meth1(int a,int b, int c)
	{
		String result;
		if (a>b) 
		{
			if (b>c) 
			{
				result="a>b>c";
			}
			else if (a>c) 
			{
				result="a>b>c";
			}
			else 
			{
				result="c>a>b";
			}
		}
		else 
		{
			if (a>c) 
			{
				result="b>a>c";
			}
			else if (b>c) 
			{
				result="b>c>a";
			}
			else 
			{
				result="c>b>a";
			}
		}
		if (a==b) 
		{
			if (b==c) 
			{
				result="a==b==c";
			}
			else if (a>c) 
			{
				result="a==b>c";
			}
			else 
			{
				result="c>a==b";
			}
		}
		else if (b==c) 
		{
			if (a>b) 
			{
				result="a>b==c";
			}
			else 
			{
				result="b==c>a";
			}
		}
		else if (a==c) 
		{
			if (b>a) 
			{
				result="b>a==c";
			}
			else 
			{
				result="a==c>b";
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		ClassAZ bobj = new ClassAZ();
		System.out.println(bobj.meth1(3, 2, 1));
		System.out.println(bobj.meth1(7, 9, 0));
		System.out.println(bobj.meth1(02, 6, 64));
		System.out.println(bobj.meth1(87, 53, 8765));
		System.out.println(bobj.meth1(6534, 87567654, 9876));
		System.out.println(bobj.meth1(764875, 5435634, 876876));
	}
}
