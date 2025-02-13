package pack5;

public class Functional_Interface_ClassB 
{
	void display()
	{
		System.out.println("Implementing Lambda Expression");
		Functional_IntrefaceB x=(data1,data2,data3)->
		{
			System.out.println("data1 : "+data1);
			System.out.println("data2 : "+data2);
			System.out.println("data3 : "+data3);
		};
		x.meth1(50, "Java", 'A');
	}
	public static void main(String[] args) 
	{
		new Functional_Interface_ClassB().display();	
	}
}
