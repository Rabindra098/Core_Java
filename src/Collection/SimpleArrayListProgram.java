package Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class SimpleArrayListProgram {
	public static void main(String[] args) {
//		List<Object> list1 = new ArrayList<Object>();
//		list1.add("Rohit");
//        list1.add("Virat");
//        list1.add("Dhoni");
//        List<Object> list2 = new ArrayList<Object>();
//		list2.add("A");
//        list2.add("B");
//        list2.add("C");
//        list1.addAll(list2);
//        System.out.println(list1);
//        list1.remove(2);
//        System.out.println(list1);
//        System.out.println(list1.size());
//        System.out.println(list1.indexOf("A"));
//        System.out.println(list1.lastIndexOf("Virat"));
        ArrayList al=new ArrayList();
        LinkedList ll=new LinkedList();
        System.out.println(al instanceof Serializable);
        System.out.println(ll instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(ll instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(ll instanceof RandomAccess);
	}
}
