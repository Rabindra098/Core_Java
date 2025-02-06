package pack2;

public class ClassY 
{
	static int x=m1();
	public static void main(String[] args) 
	{
		System.out.println(ClassY.x);
	}
	static
	{
		System.out.println(x);
		ClassY.x=x+20;
	}
	static int m1()
	{
		ClassY.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassY.x);//50
		return 100;
	}
}
