package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {
	public static void main(String[] args) {
		List<Object> v = new ArrayList<Object>();
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		ListIterator<Object> e = v.listIterator();
		//Forward direction
		while (e.hasNext()) {
			Integer obj = (Integer) e.next();
			if (obj % 2 == 0) {
				System.out.print(obj + " ");
			}

		}
		//backward direction
		while (e.hasPrevious()) {
			Integer obj = (Integer) e.previous();
			if (obj % 2 == 0) {
				System.out.print(obj + " ");
			}

		}

	}
}
