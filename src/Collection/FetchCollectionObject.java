package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class FetchCollectionObject {
	public static void main(String[] args) {
		// using toString
		List<String> cart = new ArrayList<>();
		cart.add("Laptop");
		cart.add("Mobile");
		System.out.println(cart); 
		// [Laptop, Mobile]
		
		//using for loop
		List<String> students = new ArrayList<>();
		students.add("Ramesh");
		students.add("Sita");
		students.add("Deba");
		students.add("Mita");
		students.add("Ramu");
		students.add("Lata");

		for(int i = 0; i < students.size(); i++) {
		    System.out.print(students.get(i)+" ");
		}
		System.out.println();
		
		//by using for-each loop
		for(String mail : students) {
		    System.out.print(mail+" ");
		}
		System.out.println();

//		Using Enumeration interface
		Vector<String> playlist = new Vector<>();
		playlist.add("Song1");
		playlist.add("Song2");

		Enumeration<String> e = playlist.elements();
		while(e.hasMoreElements()) {
		    System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		
//		Using Iterator interface
		Iterator<String> itr = students.iterator();
		while(itr.hasNext()) {
		    System.out.print(itr.next()+" ");
		}
		System.out.println();
		
//		Using ListIterator interface
		ListIterator<String> listItr = students.listIterator();
		// forward
		while(listItr.hasNext()) {
		    System.out.print(listItr.next()+" ");
		}
		System.out.println();
		// backward
		while(listItr.hasPrevious()) {
		    System.out.print(listItr.previous()+" ");
		}
		System.out.println();

//		Using Spliterator interface
		Spliterator<String> split = students.spliterator();
		split.forEachRemaining(System.out::print);
		System.out.println();

//		Using forEach() method
		students.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
//		Using Method Reference
		students.forEach(System.out::print);





	}
}
