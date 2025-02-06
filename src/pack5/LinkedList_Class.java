package pack5;
//LinkedList
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class 
{
	void meth1()
	{
		System.out.println("Implementing LinkedList");
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(10);		//Insertion order is maintained
		ll.add("Java");	//Heterogenious data is allowed
		ll.add(null);	//null values is allowed
		ll.add(10); 	//Duplicates values are allowed
		ll.add('A');	//It is avaleable from java 1.2v 
						//[In LinkedList elements will be stored in the form of NODES]
		ll.add(true);	//Its Default Capacity is 0.
		ll.add(104);	//Its size increased by Double
		ll.add(100); 	//It is not Sychronized
		
		System.out.println("LinkedList : "+ll);
		
		System.out.println("\nRetriving the data by using for-each loop");
		for(Object o:ll)
			System.out.print(o+" ");
		System.out.println("\n\nRetriving the data by using for loop in forword direction");
		for(int i=0;i <= ll.size()-1;i++)
			System.out.print(ll.get(i)+" ");
		System.out.println("\n\nRetriving the data by using for loop in backword direction");
		for(int i=ll.size()-1;i>=0;i--)
			System.out.print(ll.get(i)+" ");
		System.out.println("\n\nRetriving the data by using ListIterater forword direction");
		ListIterator<Object> li1=ll.listIterator();
		while (li1.hasNext()) 
		{
			System.out.print(li1.next()+" ");
		}
		System.out.println("\n\nRetriving the data by using ListIterater backword direction");
		ListIterator<Object> li2=ll.listIterator(ll.size()-0);
		while (li2.hasPrevious()) 
		{
			System.out.print(li2.previous()+" ");
		}
	}
	public static void main(String[] args) 
	{
		new LinkedList_Class().meth1();
	}
}
