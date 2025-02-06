package pack2;

import java.util.Arrays;

public class ClassBN 
{
	String[] meth1(int arr[])
	{
		System.out.println("arr :"+Arrays.toString(arr));
		String[] data= {"Hi","Hello","java"};
		return data;
		//return new String[] {"Hi","Hello","java"};
	}
	public static void main(String[] args) 
	{
		ClassBN aobj = new ClassBN();
		aobj.meth1(new int[] {11,22,33,44});
		int input[]= {11,22,33,44};
		String result []=aobj.meth1(input);
		System.out.println("result :"+Arrays.toString(result));
	}
}
