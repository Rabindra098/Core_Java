package Problems;

import java.util.Arrays;

/*
Write a Java program that reads an array of integers, filters out the negative numbers,
 and then calculates the sum of the squares of the remaining positive numbers using streams and the reduce method.

Input:
Input array: [-3, 2, -5, 6, -1, 4]
Output:
Sum of squares of positive numbers: 52  
*/
public class squerePositiveNo 
{
	void meth1()
	{
		int arr[]= {-3, 2, -5, 6, -1, 4};
		int sumOfNumber=Arrays.stream(arr).filter(n -> n > 0).map(n->n*n).reduce(0, Integer::sum);
		System.out.println(sumOfNumber);
	}
	public static void main(String[] args) 
	{
		new squerePositiveNo().meth1();
	}
}
