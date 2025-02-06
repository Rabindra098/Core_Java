package pack2;

import java.util.Arrays;

public class ClassBY 
{
/*
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

	middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
	middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
	middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]
	
	public int[] middleWay(int[] a, int[] b)
	{
	    // write your logic here
	}
*/
	public int[] middleWay(int[] a, int[] b)
	{
	    return new int [] {a[1],b[1]};
	}
	public static void main(String[] args) 
	{
		ClassBY aobj = new ClassBY();
		int input1[]= {1,2,3};
		int input2[]= {6,9,6};
		int result []=aobj.middleWay(input1, input2);
		System.out.println(Arrays.toString(result));
	}
}
