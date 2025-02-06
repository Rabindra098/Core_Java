package pack5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Vector;

public class HashMap_Class 
{
	public void meth1() 
	{
		System.out.println("Implementing HashMap");
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(100, "Java");	//Insertion Order not maintained
		hm.put("Java", "Java");	//Heterogeneous keys & Heterogeneous Values are allowed
		hm.put(null, null);		//null keys & null values are allowed
		hm.put(100, "Java");	//Duplicate keys & values are allowed
		hm.put('A', "Oracle");	//It is avaleable in Java 1.2v[Lode factor is 0.75]
		hm.put(true, 200);		//Its default capacity is 16
		hm.put(29, "Spring");	//It is increased by dauble
		hm.put(49, "AWS");		//It is not sychronized
		
		System.out.println("HashMap : "+hm);
		System.out.println("\nhp.get('A') : "+hm.get('A'));
		
		System.out.println("\nRetriving the data by using List and set Interfaces\n");
		ArrayList<Object> al = new ArrayList<Object>(hm.keySet());
		LinkedList<Object> ll = new LinkedList<Object>(hm.keySet());
		Vector<Object> v = new Vector<Object>(hm.keySet());
		
		HashSet<Object> hs = new HashSet<Object>(hm.keySet());
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(hm.keySet());
		//TreeSet<Object> ts = new TreeSet<Object>(hp.keySet());
		
		System.out.println("al  : "+al);
		System.out.println("ll  : "+ll);
		System.out.println("v   : "+v);
		System.out.println("hs  : "+hs);
		System.out.println("lhs : "+lhs);
		//System.out.println("ts : "+ts);//In HashMap keys & values are not shorting order
		System.out.println("\nRetriving the data from hash map by using for-each loop");
		for(Object o:hs)
			System.out.println(o+" "+hm.get(o));
		System.out.println("\nRetriving the data from Hashmap by using Entryset");
		ArrayList<Object> al2 = new ArrayList<Object>(hm.entrySet());
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
