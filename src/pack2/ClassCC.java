package pack2;
/*
    Given an int array, return a new array with double the length where its last element 
    is the same as the original array, and all the other elements are 0. The original array
    will be length 1 or more.
	
	makeLast([4, 5, 6]) ? [0, 0, 0, 0, 0, 6]
	makeLast([1, 2]) ? [0, 0, 0, 2]
	makeLast([3]) ? [0, 3]
	
	public int[] makeLast(int[] nums)
	{
	    // write your logic here
	}
 */

import java.util.Arrays;

public class ClassCC 
{
	public int[] makeLast(int[] nums)
	{
		//int result1[] =new int []{[((nums.length)*2)],nums[nums.length-1]};
		
		int res[]=new int[nums.length*2];
		res[res.length-1]=nums[nums.length-1];
	    return res;  //nums[10]
	}
	public static void main(String[] args) 
	{
		ClassCC aobj = new ClassCC();
		int input[]= {1,2,3};   //4
		int result[]=aobj.makeLast(input);
		System.out.println(Arrays.toString(result));
	}
}
