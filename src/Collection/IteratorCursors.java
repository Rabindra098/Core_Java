package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursors {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Object> itr = al.iterator();
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			if (num % 2 == 0)
				System.out.print(num + " ");
			else
				itr.remove();
		}
		System.out.println();
		System.out.println(al);
	}

}
