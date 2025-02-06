package pack2;

public class ClassV 
{
	int x=10;
	public static void main(String[] args) 
	{
		//System.out.println(ClassV.x);	\\C.E error 
		System.out.println(new ClassV().x);
	}
	static
	{
		int x=30;
		System.out.print(x+" ");
	}
}
