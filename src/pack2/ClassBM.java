package pack2;

import java.util.Iterator;

public class ClassBM 
{
	void meth1()
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(arr.length);
	}
	public static void main(String[] args) 
	{
		new ClassBM().meth1();
	}
}
