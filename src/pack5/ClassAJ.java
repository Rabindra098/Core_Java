package pack5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClassAJ 
{
	void meth1()
	{
		System.out.println("--------Meth1() Implementing---------");
		int arr[]= {1,4,3,5,7,8,0,2,6,7,9};
		System.out.println("Before shorting an Array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("\nAfter shorting an Array : "+Arrays.toString(arr));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		System.out.println("\nBefore shorting an ArrayList : "+al);
		System.out.println("\nShorting ArrayList By using TreeSet : "+new TreeSet<Integer>(al));
		Collections.sort(al);
		System.out.println("\nAfter shorting an ArrayList : "+al);
	}
	void meth2()
	{
		System.out.println("\n--------Meth2() Implementing---------");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(50);
		lhs.add(30);
		lhs.add(20);
		lhs.add(40);
		System.out.println("Before shorting the LinkedHashSet : "+lhs);
		System.out.println("\nShorting LinkedHashSet By using TreeSet : "+new TreeSet<Integer>(lhs));
//		Collections.sort(lhs);	//C.E because  Collections.sort(lhs) will not on set
		ArrayList<Integer> al=new ArrayList<Integer>(lhs);
		Collections.sort(al);
		System.out.println("\nShorting LinkedHashSet By using ArrayList : "+al);
	}
	public static void main(String[] args) 
	{
		new ClassAJ().meth1();
		new ClassAJ().meth2();
	}
}
