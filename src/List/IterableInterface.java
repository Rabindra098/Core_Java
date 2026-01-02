package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {
	public static void main(String[] args) {
		List<Object> v = new ArrayList<Object>();
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		Iterator<Object> e = v.iterator();
		while (e.hasNext()) {
			Integer obj = (Integer) e.next();	
			if (obj % 2 == 0) {
				System.out.print(obj + " ");
			}

		}

	}
}
