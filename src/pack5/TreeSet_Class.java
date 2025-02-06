package pack5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class 
{
	void meth1()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(10);		//Insertion order is not maintained but shorting order is maintained (Binary serch tree algo)
		//ts.add("Java");	//Heterogenious data not allowed
		//ts.add(null);	//null values are not allowed
		ts.add(10);		//Duplicates are not allowed
		//ts.add(true);	//It is avaleable from java 1.2v
		//ts.add('A');	//Its default capacity is 16[It lode factor is 0.75]
		ts.add(40);		//Its increased by double
		ts.add(100);	//It is not sychronized
		ts.add(29);
		ts.add(67);
		ts.add(87);
		
		System.out.println("TreeSet :"+ts);
		System.out.println("size() : "+ts.size());
		//System.out.println("get() : "+ts.get());	We can not get() on set implemented class 
		System.out.println("Retriving the data by using for each loop in ascending order");
		for(Object o:ts)
			System.out.print(o+" ");
		System.out.println("\n\nRetiving the data by using descending order");
		Iterator<Object> i=ts.descendingIterator();
		while (i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
	}
	public static void main(String[] args) 
	{
		new TreeSet_Class().meth1();
	}
	
}
