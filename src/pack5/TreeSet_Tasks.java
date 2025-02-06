package pack5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Tasks 
{
	void meth1()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("apple");
		ts.add("banana");
		ts.add("cherry");
		ts.add("data");
		ts.add("elderberry");
		System.out.println("TreeSet : "+ts);
		System.out.println("\nRetriving the data by using descendingIterator");
		Iterator<Object> i=ts.descendingIterator();
		while (i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
	}
	void Add_TreeSet_to_TreeSet()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(10);		
		ts1.add(20);
		ts1.add(30);
		ts1.add(10);
		ts1.add(50);
		TreeSet<Object> ts2 = new TreeSet<Object>(ts1);
		System.out.println("ts1 :"+ts1);
		System.out.println("ts2 :"+ts2);
	}
	void TreeSet_to_Array()
	{
		System.out.println("\nImplementing TreeSet");
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("apple");
		ts.add("banana");
		ts.add("cherry");
		ts.add("data");
		ts.add("elderberry");
		
		String [] arr=ts.toArray(new String[0]);
		System.out.println("TreeSet To Array : "+Arrays.toString(arr));
	}
	void find_lowest_highest()
	{
		System.out.println("Implementing TreeSet");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);		
		ts.add(20);
		ts.add(999);
		ts.add(5);
		ts.add(60);
		int lowest=ts.first();
		int highest=ts.last();
		
		System.out.println("Lowest Number is :"+lowest);
		System.out.println("Highest Number is :"+highest);
	}
	public static void main(String[] args) 
	{
		TreeSet_Tasks tst = new TreeSet_Tasks();
		tst.meth1();
		tst.Add_TreeSet_to_TreeSet();
		tst.TreeSet_to_Array();
		tst.find_lowest_highest();
	}
}
