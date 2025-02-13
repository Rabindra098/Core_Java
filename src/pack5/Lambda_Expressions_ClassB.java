package pack5;

public class Lambda_Expressions_ClassB 
{
	void display()
	{
		System.out.println("Implementing Lambda Expression");
		
		InterfaceD x=(String msg)->System.out.println("Hello Java");//1st Way 
		x.meth1("Java");
		
		InterfaceD y=(msg)->System.out.println("I love Java");	   //2nd way
		y.meth1("Hello");
		
		InterfaceD z=msg->System.out.println("Java is awesome!!"); //3rd way
		z.meth1("Hyy");
	}
	public static void main(String[] args) 
	{
		new Lambda_Expressions_ClassB().display();
	}
}
