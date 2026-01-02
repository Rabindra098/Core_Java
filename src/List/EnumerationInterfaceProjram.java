package List;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInterfaceProjram {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}
		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			Integer obj = (Integer) e.nextElement();
			if (obj % 2 == 0) {
				System.out.print(obj+" ");
			}

		}

	}
}
