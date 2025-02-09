package Problems;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Write a Java program that creates a stream of integers using Stream.
 * of, filters out the even numbers and then prints each squared number using forEach.
Input (Stream):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
Output:
2
4
6
8
10
 */

public class FilterEven_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println("Retribing the data by using for each-loop");
		for(Object o:al)
			System.out.print(o+" ");
		System.out.println("\n\nRetribing the data by using Iterater");
		Iterator<Integer> i=al.iterator();
		while (i.hasNext()) 
		{
			if (i.next()%2!=0) 
			{
				i.remove();
			}
		}
		System.out.println(al);
	}
}
