package oct12_ListItrator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList<>();
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(40);
		
		ListIterator li=l.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		
//		System.out.println("-------");
//		
//		
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
		System.out.println(l);
		
		while(li.hasNext()) {
			Integer i=(Integer)li.next();
			if(i==50) {
				li.add(90);
			}
		}
		System.out.println(l);
	}

}
