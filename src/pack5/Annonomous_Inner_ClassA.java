package pack5;

public class Annonomous_Inner_ClassA 
{
	void meth1()
	{
		System.out.println("Hello world");
	}
	public static void main(String[] args) 
	{
		Annonomous_Inner_ClassA ain = new Annonomous_Inner_ClassA()
				{
					@Override
					void meth1() 
					{
						System.out.println("Java is awesome!!");
						super.meth1();
					}
				};
		ain.meth1();
	}
}
