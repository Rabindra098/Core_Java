package Collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		  HashSet<Object> h=new HashSet<Object>();
		  h.add("A");
		  h.add("10");
		  h.add("Z");
		  h.add("D");
		  h.add(null);
		  h.add("A");
		  System.out.println(h.add("B"));
		  System.out.println(h);
	}
}
