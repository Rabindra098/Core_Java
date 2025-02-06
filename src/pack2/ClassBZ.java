package pack2;

import java.util.Arrays;

/*
	Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	
	makePi() ? [3, 1, 4]
	
	public int[] makePi()
	{
	     // write your logic here
	}
*/
public class ClassBZ 
{
	public int[] makePi()
	{
	     return new int [] {3,1,4};
	}
	public static void main(String[] args) 
	{
		ClassBZ aobj = new ClassBZ();
		int result[] =aobj.makePi();
		System.out.println(Arrays.toString(result));
	}
}
