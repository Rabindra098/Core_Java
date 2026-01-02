package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumurationCursors {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			Integer num = (int) e.nextElement();
			if (num % 2 == 0) {
				System.out.print(num+" ");
			}

		}
		System.out.println();
		System.out.println(v);

	}

}
