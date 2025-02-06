package pack2;

import java.util.Arrays;

public class ClassBV 
{
/*	 
  	Given an array of ints length 3, return the sum of all the elements.

	sum3([1, 2, 3]) ? 6
	sum3([5, 11, 2]) ? 18
	sum3([7, 0, 0]) ? 7
	
	public int sum3(int[] nums)
	{
	    // write your logic here
	
	}
*/
	public int sum3(int[] nums)
	{
		if (nums.length==3)
		{
			System.out.print("The sum of all the elements in arr is ");
			return (nums[0]+nums[1]+nums[2]);
		}
		else
		{
			System.out.print("nums length is ");
			return nums.length;
		}
	}
	public static void main(String[] args) 
	{
		ClassBV aobj = new ClassBV();
		int input []= {5,2,2};
		int result=aobj.sum3(input);
		System.out.println(result);
	}
}
