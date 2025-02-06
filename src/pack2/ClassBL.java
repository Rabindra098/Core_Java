package pack2;

public class ClassBL 
{
	void meth1()
	{
		int arr1[]=new int[0];
		System.out.println("arrq length :"+arr1.length);
		//arr1[0]=100;	//It generate ArrayIndexOutBoundsEcception
		//System.out.println(arr1[0]);
		//int arr2[]=new int [-5];	//It generate NegativeArraySizeException
		//System.out.println("arr2 length :"+arr2.length);
		boolean arr3[]=new boolean[2147483647];	//maximum element
		float arr4[]=new float['A'];
		System.out.println("arr4 length "+arr4.length);
	}
	public static void main(String[] args) 
	{
		new ClassBL().meth1();
	}
}
