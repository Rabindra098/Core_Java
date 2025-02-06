package pack2;

import java.util.Arrays;

public class ClassBW 
{
/*	
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

	rotateLeft3([1, 2, 3]) ? [2, 3, 1]
	rotateLeft3([5, 11, 9]) ? [11, 9, 5]
	rotateLeft3([7, 0, 0]) ? [0, 0, 7]
	
	public int[] rotateLeft3(int[] nums)
	{
	    // write your logic here    
	} 
*/
	 public int[] rotateLeft3(int[] nums) 
	 {
	     // Rotate the array elements
	     return new int[] { nums[1], nums[2], nums[0] };
	 }

	 public static void main(String[] args) 
	 {
		 // Test cases
		 ClassBW aobj = new ClassBW();
	     int[] result1 = aobj.rotateLeft3(new int[] { 1, 2, 3 });
	     int[] result2 = aobj.rotateLeft3(new int[] { 5, 11, 9 });
         int[] result3 = aobj.rotateLeft3(new int[] { 7, 0, 0 });

	     // Print results
	     System.out.println(Arrays.toString(result1)); // [2, 3, 1]
         System.out.println(Arrays.toString(result2)); // [11, 9, 5]
         System.out.println(Arrays.toString(result3)); // [0, 0, 7]
	 }
}
