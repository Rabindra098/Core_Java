package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternalimplementation {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		fruits.add("KIWI");

		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.toLowerCase());
			}
		};
//		fruits.forEach(cons);
//		or
//		Consumer<String> c=str->System.out.println(str.toUpperCase());
//		fruits.forEach(c);
		// or
//		fruits.forEach(str->System.out.println(str.toLowerCase()));

		System.out.println("BY USING TOSTRING METHOD :");
		System.out.println(fruits.toString());
		System.out.println("\nBY USING ORDINARY FOR LOOP :");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " ");
		}
		System.out.println("\n");
		System.out.println("BY USING FOR EACH LOOP :");
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println("\n");
		System.out.println("BY USING ENUMERATION INTERFACE:");
		Enumeration<String> ele = fruits.elements();
		while (ele.hasMoreElements()) {
			System.out.print(ele.nextElement() + " ");
		}

		System.out.println("\n\nBY USING ITERATOR INTERFACE :");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n\nBY USING LISTITERATOR INTERFACE :");
		ListIterator<String> litItr = fruits.listIterator();
		System.out.println("IN FORWARD DIRECTION");
		while (litItr.hasNext()) {
			System.out.print(litItr.next() + " ");
		}

		System.out.println("\n\nIN BACKWARD DIRECTION");
		while (litItr.hasPrevious()) {
			System.out.print(litItr.previous() + " ");
		}

		System.out.println("\n\nBY USING SPLITITERATOR INTERFACE :");

		Spliterator<String> splItr = fruits.spliterator();
		splItr.forEachRemaining(fruit -> System.out.print(fruit + " "));
		System.out.println("\n\nBY USING FOR EACH METHOD :");
		fruits.forEach(fruit -> System.out.print(fruit.toUpperCase() + " "));

		System.out.println("\n\nBY USING METHOD REFERENEC :");
		fruits.forEach(System.out::println);

	}
}
