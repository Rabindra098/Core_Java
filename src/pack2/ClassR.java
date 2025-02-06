package pack2;

public class ClassR 
{
	final static int x;
	static
	{
		x=100;
		System.out.println("1st static block executed :"+x);
	}
	public static void main(String[] args) 
	{
		System.out.println("ClassR main() called :"+x);
	}
	static
	{
		System.out.println("2st static block executed :"+x);
	}
}
