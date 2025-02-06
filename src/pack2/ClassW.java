package pack2;

class ClassW 
{
	static int x=10;
	public static void main(String[] args) 
	{
		ClassW t1 = new ClassW();
		ClassW t2 = new ClassW();
		t1.x=20;
		System.out.print(x+" ");
		System.out.println(t2.x);
	}
}
