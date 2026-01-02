package Collection;

import java.util.LinkedList;

public class SimpleLinkedListProgram {
	public static void main(String[] args) {
		LinkedList<Object> l =new LinkedList<Object>();
		l.add("Rabi");
		l.add(30);
		l.add(null);
		l.add("Rabi");
		l.add("Lata");
		l.set(0,"Hari");
		l.add(1,72);
		l.removeLast();
		l.addFirst("Hello");
		System.out.println(l);
	}
}