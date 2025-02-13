package pack5;

import java.util.ArrayList;
import java.util.Iterator;

public class StreamAPI_ClassA 
{
	void meth1()
	{
		System.out.println("Implementing Stream API");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("\nRetrive the data by using Iterater");
		Iterator<Integer> i=al.iterator();
		while (i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n\nRetrive the data by using forEach method");
		al.forEach(data->System.out.print(data+" "));
	}
	public static void main(String[] args) 
	{
		new StreamAPI_ClassA().meth1();
	}
	
}
