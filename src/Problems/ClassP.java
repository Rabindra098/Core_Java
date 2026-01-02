package Problems;

public class ClassP extends ClassQ
{
	public InterfaceA display() 
	{
		System.out.println("Hello Gyes");
		return new InterfaceA() 
		{
			@Override
			public void msg() 
			{
				System.out.println("Hellow InterfaceA");
			}
		};
	}
	public static void main(String[] args) 
	{
		ClassP aobj = new ClassP();
		InterfaceA i=aobj.display();
//		aobj.display();
		i.msg();
	}
}
