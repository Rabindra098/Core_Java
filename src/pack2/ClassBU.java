package pack2;

public class ClassBU 
{
	/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

			sameFirstLast([1, 2, 3]) ? false
			sameFirstLast([1, 2, 3, 1]) ? true
			sameFirstLast([1, 2, 1]) ? true

			public boolean sameFirstLast(int[] nums)
			{  
			    //write your logic here
			}
	*/
	public boolean sameFirstLast(int[] nums)
	{  
	    if ((nums[0]==1) && (nums[nums.length-1]==1)) 
	    	return true;
	    else 
	    	return false;		
	}
	public static void main(String[] args) 
	{
		ClassBU aobj = new ClassBU();
		int input []= {1,2,2};
		boolean result=aobj.sameFirstLast(input);
		System.out.println(result);
	}
}
