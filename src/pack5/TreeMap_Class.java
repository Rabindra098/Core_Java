package pack5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap_Class 
{
	void meth1()
	{
		System.out.println("Implementing TreeMap");
		TreeMap<Object, Object> tm = new TreeMap<Object,Object>();
		tm.put(100, "Java");		//Insertion Order is not maintained but sorting order maintained
		//tm.put("Java", "Java");	//Heterogenious keys are not allowed but Heterogenious values are not allowed but 
		tm.put(109, null);		    //Null key are not allowed & null values are allowed
		tm.put(103, "React Js");	//duplicate values are not allowed
		//tm.put('A', "Oracle");	//It is avaleable from Java 1.2v
		tm.put(101, "Spring");		//Its default capacity is 16
		//tm.put(true, "HTML");		//It is increased by double
		tm.put(199, "AWS");			//It is not sychronized
		tm.put(389, 287);
		tm.put(107, "DevOps");	
		
		System.out.println("TreeMap : "+tm);
		System.out.println("\nRetriving all the keys in descreasing order");
		TreeSet<Object> ts = new TreeSet<Object>(tm.keySet());
		Iterator<Object> i=ts.descendingIterator();
		ArrayList<Object> al = new ArrayList<Object>();
		while (i.hasNext()) 
		{
			Object o =i.next();
			//System.out.println(o+" "+tm.get(o));
			System.out.println(o+" "+al.add(o));
		}
		System.out.println("-----------------------");
	    Iterator<Object> i1= al.iterator();
	    while (i1.hasNext()) 
	    {
			Object o =i1.next();
			System.out.println(o+" <==> "+tm.get(o));	
		}
		
	}
	public static void main(String[] args) 
	{
		new TreeMap_Class().meth1();
	}
}
