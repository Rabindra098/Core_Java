package pack5;

public class Annonomous_Inner_ClassB 
{
	void display()
	{
		System.out.println("Implementing Functional Interface");
	/*
		Annonomous_Functional_Interface aobj=new Annonomous_Functional_Interface()
				{
					@Override
					public void meth1() 
					{
						System.out.println("abstract method overriden");
					}
			
				};
	*/
		Annonomous_Functional_Interface aobj=()->System.out.println("abstract method overriden");
				aobj.meth1();
	}
	public static void main(String[] args) 
	{
		new Annonomous_Inner_ClassB().display();
	}
}
