package pack2;

public class ClassAY 
{
	void meth1()
	{
		int i=0,j=0;
		while (i<3) 
		{
			do 
			{
				j++;
				System.out.print(j+" ");
			} 
			while (j<2);
			i++;
		}
	}
	public static void main(String[] args) 
	{
		ClassAY aobj = new ClassAY();
		aobj.meth1();
	}
}
