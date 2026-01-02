package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursors {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("Rabi");
		ll.add("Hari");
		ll.add("Nari");
		ll.add("Gori");
		System.out.println(ll);
		ListIterator<Object> li=ll.listIterator();
		while (li.hasNext()) {
			String str = (String) li.next();
			if(str.equals("Rabi"))
				li.remove();
			else if(str.equals("Hari"))
				li.add("Rama");
			else if(str.equals("Gori"))
				li.set("Kamal");
		}
		System.out.println(ll);
	}

}
