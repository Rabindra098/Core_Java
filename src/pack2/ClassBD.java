package pack2;

public class ClassBD 
{
	int x=10;
	static int y=20;
	void meth1()
	{
		int x=1000;
		int y=2000;
		System.out.println("Instance variable x :"+this.x);
		System.out.println("Static variable y :"+this.y);
		System.out.println("Local variable x :"+x+" y :"+y);
	}
	public static void main(String[] args) 
	{
		new  ClassBD().meth1();
	}
}
