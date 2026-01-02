package pack5;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_time {
	
	private static Object arr[];
	static {
		arr = new Object[100000];
		for (int i = 0; i < arr.length; i++) // using for loop passing 1000000 objects
		{
			arr[i] = new Object();
		}
	}

	void ArrayList() {
		long start;
		long end;
		ArrayList<Object> al = new ArrayList<Object>();
		start = System.currentTimeMillis();
		// It is a static method gives the current system time long millisec
		for (Object obj1 : arr)
			al.add(obj1);
		end = System.currentTimeMillis();
		System.out.println("ArrayList construction time : " + (end - start));
	}

	void LinkedList() {
		long start;
		long end;
		LinkedList<Object> li = new LinkedList<Object>();
		start = System.currentTimeMillis();
		// It is a static method gives the current system time long millisec
		for (Object obj2 : arr)
			li.add(obj2);
		end = System.currentTimeMillis();
		System.out.println("LinkedList construction time : " + (end - start));
	}

	void meth1() {
		for (Object o : arr)
			System.out.println(o);
	}

	public static void main(String[] args) {
		LinkedList_time llt = new LinkedList_time();
		llt.ArrayList();
		llt.LinkedList();
		 llt.meth1();
	}
}
