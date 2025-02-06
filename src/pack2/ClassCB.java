package pack2;

import java.util.Arrays;

/*
	Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

	makeEnds([1, 2, 3]) ? [1, 3]
	makeEnds([1, 2, 3, 4]) ? [1, 4]
	makeEnds([7, 4, 6, 2]) ? [7, 2]
	
	
	public int[] makeEnds(int[] nums)
	{
	     // write your logic here
	}
 */
public class ClassCB 
{
	public int[] makeEnds(int[] nums)
	{
	    return new int[] {nums[0],nums[nums.length-1]};
	}
	public static void main(String[] args) 
	{
		ClassCB aobj = new ClassCB();
		int input[]= {1,2,3,98,7};
		int result[]=aobj.makeEnds(input);
		System.out.println(Arrays.toString(result));
	}
}
