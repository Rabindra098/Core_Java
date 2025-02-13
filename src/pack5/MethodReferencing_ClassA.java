package pack5;

public class MethodReferencing_ClassA 
{
	void display()
	{
		System.out.println("Implementin Lambda Expression");
		
		InterfaceA x=new MethodReferencing_ClassB()::show;	//Non-static referencing
		
		InterfaceA y=MethodReferencing_ClassB::msg;		//static referencing
		
		InterfaceA z=MethodReferencing_ClassB::new;		//constructor referencing
		x.meth1();
		y.meth1();
		z.meth1();
//		z.meth1("Java");//for Parameter Constructor referencing
	}
	public static void main(String[] args) 
	{
		new MethodReferencing_ClassA().display();
	}
}
