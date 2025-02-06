package pack2;

public class ClassAT 
{
	void display()
	{
		int a=10;
		for (int k=(a++)+(++a)+(++a);k>10;k++)
		{
			System.out.println(k);
			break;
		}
	}
	public static void main(String[] args) 
	{
		ClassAT aobj = new ClassAT();
		aobj.display();
	}
}
