package pack5;

import java.util.ArrayList;

/*
 * Write a Java program that creates two ArrayLists of integers and then 
 * merges them into a single ArrayList. Finally, print out the merged 
 * ArrayList to the console.
 */
public class ArrayListTask4 
{
	public void meth1() 
	{
		System.out.println("Passing number into 1st ArrayList");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(292);
		al1.add(356);
		al1.add(873);
		al1.add(456);
		System.out.println("1st al1 : "+al1);
		
		System.out.println("\nPassing number into 2nd ArrayList");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(737);
		al2.add(256);
		al2.add(345);
		al2.add(947);
		System.out.println("1st al2 : "+al2);
		
		al1.addAll(al2);
		System.out.println("\nMarge Arraylist is : "+al1);
	}
	public static void main(String[] args) 
	{
		new ArrayListTask4().meth1();
	}
}
