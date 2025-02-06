package pack5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSet_Class 
{
	void meth1()
	{
		System.out.println("Implementing LinkedHasSet ");
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);	 	//Insertion order maintained
		set.add("Java");	//Heterogetious data are allowed
		set.add(null);		//nulls are allowed
		set.add(10);		//Duplicate values not allowed
		set.add('A');		//It is avaleable from java 1.2v
		set.add(true);		//Its default capacity is 16
		set.add(98);		//It is increased by double
		set.add(100);		//It is not sychronized
		
		System.out.println("LinkedHashSet : "+set);
		//System.out.println("get() : "+set.get());//we can not use get() 
		
		System.out.println("\nRetriving the data by using for-each loop");
		for(Object o:set)	//We can not use for loop because insersion order not maintained
			System.out.print(o+" ");
		System.out.println("\n\nRetriving the data by using Iterater forword direction");
		Iterator<Object> i1=set.iterator();
		while (i1.hasNext()) 
		{
			System.out.print(i1.next()+" ");
		}
		System.out.println("\n\nIn HashSet we can not retriving the data in backword direction");
		ArrayList<Object> al1 = new ArrayList<Object>(set);
		ListIterator<Object> i2=al1.listIterator(set.size());
		System.out.println("Retriving the data by using ListIterator backword direction");
		while (i2.hasPrevious()) 
		{
			System.out.print(i2.previous()+" ");
		}
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(10);
		al2.add(10);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al2);
		System.out.println("\n\nal2 : "+al2+"==>"+al2.size());
		System.out.println("hs : "+lhs+"==>"+lhs.size());
		
	}
	public static void main(String[] args) 
	{
		new LinkedHashSet_Class().meth1();
	}
}
