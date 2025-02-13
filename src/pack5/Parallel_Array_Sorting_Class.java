package pack5;

import java.util.Arrays;

public class Parallel_Array_Sorting_Class 
{
	void meth1()
	{
		System.out.println("Implementing Parallel Array Sorting");
		int arr[]= {2,4,3,5,6,0,9,1,8,7};
		System.out.println("Before : "+Arrays.toString(arr));
//		Arrays.sort(arr);
		Arrays.parallelSort(arr,1,4);
		Arrays.parallelSort(arr,4,8);
		System.out.println("After : "+Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		new Parallel_Array_Sorting_Class().meth1();
	}
}
