package pack5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Map.Entry;

public class LinkedHashMap_Class 
{
	public void meth1() 
	{
		System.out.println("Implementing LinkedHashMap");
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
		lhm.put(100, "Java");	//Insertion Order  maintained
		lhm.put("Java", "Java");	//Heterogeneous keys & Heterogeneous Values are allowed
		lhm.put(null, null);		//null keys & null values are allowed
		lhm.put(100, "Java");	//Duplicate keys & values are allowed
		lhm.put('A', "Oracle");	//It is avaleable in Java 1.4v [Lode factor is 0.75]
		lhm.put(true, 200);		//Its default capacity is 16
		lhm.put(29, "Spring");	//It is increased by dauble
		lhm.put(49, "AWS");		//It is not sychronized
		
		System.out.println("HashMap : "+lhm);
		System.out.println("\nhp.get('A') : "+lhm.get('A'));
		
		System.out.println("\nRetriving the data by using List and set Interfaces\n");
		ArrayList<Object> al = new ArrayList<Object>(lhm.keySet());
		LinkedList<Object> ll = new LinkedList<Object>(lhm.keySet());
		Vector<Object> v = new Vector<Object>(lhm.keySet());
		
		HashSet<Object> hs = new HashSet<Object>(lhm.keySet());
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(lhm.keySet());
		//TreeSet<Object> ts = new TreeSet<Object>(lhm.keySet());
		
		System.out.println("al  : "+al);
		System.out.println("ll  : "+ll);
		System.out.println("v   : "+v);
		System.out.println("hs  : "+hs);
		System.out.println("lhs : "+lhs);
		//System.out.println("ts : "+ts);//In LinkedHashMap keys & values are not shorting order
		System.out.println("\nRetriving the data from LinkedHashMap by using for-each loop");
		for(Object o:hs)
			System.out.println(o+" "+lhm.get(o));
		System.out.println("\nRetriving the data from LinkedHashMap by using Entryset");
		ArrayList<Object> al2 = new ArrayList<Object>(lhm.entrySet());
		Iterator<Object> i=al2.iterator();
		while (i.hasNext()) 
		{
			//System.out.println(i.next());
			Entry<?, ?> e=(Entry<?, ?>)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) 
	{
		new HashMap_Class().meth1();
	}
}
