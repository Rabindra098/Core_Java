package pack5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Product 
{
	void meth1()
	{
		System.out.println("Implementing ArrayList");
		ArrayList<Product_Sale> al = new ArrayList<Product_Sale>();
		al.add(new Product_Sale("Laptop", 50000));
		al.add(new Product_Sale("Mobile Phone", 20000));
		al.add(new Product_Sale("Electronic Gadget", 3000));
		
		System.out.println("ArrayList : "+al);
		
		System.out.println("\nImplementing LinkedList from ArrayList");

		LinkedList<Object>ll = new LinkedList<Object>(al);
		System.out.println("LinkedList : "+ll);
		System.out.println("\nRetriving the data by using ListIterater");
		ListIterator<Object> li=ll.listIterator(ll.size()-0);
		while (li.hasPrevious()) 
		{
			System.out.print(li.previous()+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		new Product().meth1();
	}
}
