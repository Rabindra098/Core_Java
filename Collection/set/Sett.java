package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>();
		s.add(30);
		s.add(10);
		s.add(50);
		s.add(70);
		s.add(90);
		//s.add(null);
		s.add(10);
		//s.add(null);
		s.add(10);
		
		Iterator <Integer> i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
