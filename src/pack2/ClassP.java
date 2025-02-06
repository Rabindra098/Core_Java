package pack2;

public class ClassP 
{
	int x;
	static int y;
	ClassP()
	{
		x++;
		y++;
		System.out.println("instance variable x:"+x);
		System.out.println("static variable y:"+y);
	}
	public static void main(String[] args) 
	{
		new ClassP();
		System.out.println("-----------");
		new ClassP();
		System.out.println("-----------");
		new ClassP();
	}
}
