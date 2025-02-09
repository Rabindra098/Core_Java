package pack5;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Write a Java program that creates an ArrayList of integers and then 
 * removes all even numbers from it. Finally, print out the ArrayList to the console.
 */
public class ArrayListTask3 
{
	public void meth1()
	{
		System.out.println("Passing Number into ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(24);
		al.add(73);
		al.add(92);
		al.add(53);
		al.add(97);
		al.add(100);
		al.add(84);
		System.out.println("\nBefore al :"+al);
		Iterator<Integer> i=al.iterator();
		while (i.hasNext()) 
		{
			if (i.next()%2==0) 
			{
				i.remove();
			}
		}
		System.out.println("\nAfter removing even Number : "+al);	
	}
	public static void main(String[] args) 
	{
		new ArrayListTask3().meth1();
	}
}
