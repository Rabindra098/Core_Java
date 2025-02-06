package pack2;

import java.util.Arrays;

public class ClassBX 
{
/*
    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

	maxEnd3([1, 2, 3]) ? [3, 3, 3]
	maxEnd3([11, 5, 9]) ? [11, 11, 11]
	maxEnd3([2, 11, 20]) ? [20,20,20]
	
	public int[] maxEnd3(int[] nums)
	
	{
	    // write your logic here
	}
*/
	public int[] maxEnd3(int[] nums)
	{
		int max = Math.max(nums[0], nums[2]);
//		nums[0]=max;
//		nums[1]=max;
//		nums[2]=max;
		return new int[]{nums[0]=max,nums[1]=max,nums[2]=max};
	}
	 public static void main(String[] args) 
	 {
		 ClassBX aobj = new ClassBX();
	     int[] result1 = aobj.maxEnd3(new int[] { 987, 87362846, 89});
	     int[] result2 = aobj.maxEnd3(new int[] { 876, 8762, 9 });
         int[] result3 = aobj.maxEnd3(new int[] { 2, 11, 20 });

	     System.out.println(Arrays.toString(result1)); // [3, 3, 3]
         System.out.println(Arrays.toString(result2)); // [9, 9, 9]
         System.out.println(Arrays.toString(result3)); // [20, 20, 20]
	 }
}
