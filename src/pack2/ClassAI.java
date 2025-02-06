package pack2;

//2) WAP Take values of length and breadth of a rectangle from parameterized method and check if it is square or not

public class ClassAI 
{
	void cheaksquare(int length,int breath) 
	{
		if (length==breath) 
		{
			System.out.println("It is a square");
		}
		else 
		{
			System.out.println("It is not a square");
		}
	}
	public static void main(String[] args) 
	{
		ClassAI aobj = new ClassAI();
		aobj.cheaksquare(2, 2);
	}
}
