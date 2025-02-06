package pack5;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList
public class ArrayList_Class 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList\n");
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);	//Insertion order id maintained
		//al.add("java");	//Heterogeneous data is allowed
		al.add(null);	//Null values allowed
		al.add(10);	//Duplicate are allowed
		//al.add('A');//	//It is available from java 1.2v
		al.add(13);
		al.add(66);
		//al.add(true);	//Its default capacity is 10
		al.add(11);	//Its size increases by half = (current capacity * 3/2)+1
		//al.add(0.67f);
		al.add(13);
		al.add(100);//It is not synchronized
		System.out.println("al :"+al);
		
		System.out.println("\nsize() : "+al.size());
		System.out.println("get() : "+al.get(1));	//1= index position
		System.out.println("get() : "+al.get(al.size()-1));	
		
		System.out.println("\nRetrive the data by using for loop forword direction");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n\nRetrive the data by using for loop backword direction");
		for (int i = al.size()-1; i >=0; i--) 
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n\nRetrive the data by using for-each loop");
		for (Object o:al) 
		{
			System.out.print(o+" ");
		}
		
		System.out.println("\n\nRetrive the data by using Iterater loop");
		Iterator<Integer> i=al.iterator();
		while (i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n\n--------METHODS--------");
		System.out.println("isEmpty() : "+al.isEmpty());
		//al.clear();
		//System.out.println("isEmpty() : "+al.isEmpty());
		System.out.println(al.contains(10));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(100);
		System.out.println("\n"+al2);
		System.out.println("containAll() : "+al.containsAll(al2));
		System.out.println("Before :"+al);
		al.addAll(1,al2);
		System.out.println("After : "+al);
		System.out.println("remove() : "+al.remove((Object)10));
		//System.out.println("removeAll() : "+al.removeAll(al2));
		System.out.println("retainAll() : "+al.retainAll(al2));
		System.out.println("After : "+al);
		
		
	}
	public static void main(String[] args) 
	{
		new ArrayList_Class().meth1();
	}
}
