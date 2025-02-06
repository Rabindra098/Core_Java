package pack2;

public class ClassQ 
{
	int x=100;	//Instance / Global / Non-static Variable
	static int y=1000;	//Static Variable / Class Variable
	
	void meth1()	//Normal / Instance / Non-Static method
	{
		System.out.println("meth1() called");
		System.out.println("instance variable x:"+x);
		System.out.println("static variable y:"+y);
	}
	static void meth2()	//Static method
	{
		System.out.println("meth2() called");
		System.out.println("instance variable x:"+new ClassQ().x);
		System.out.println("static variable y:"+y);
	}
	public static void main(String[] args) 
	{
		ClassQ aobj = new ClassQ();
		aobj.meth1();	
		aobj.meth2();	//by using Class object
		ClassQ.meth2();	//by using Class name
		meth2();	//by using identifier name
	}
}
