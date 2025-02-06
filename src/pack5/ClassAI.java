package pack5;

import java.util.LinkedList;
import java.util.List;

public class ClassAI 
{
	public void meth1() 
	{
		System.out.println("Meth1() Called");
		LinkedList<Object> ll1 = new LinkedList<Object>();
		ll1.add(100);
		ll1.offer(200);
		List<Object> ll2 = new LinkedList<Object>();
		ll2.add(10);
		ll2.add(20);
		System.out.println(ll1+" "+ll2);
	}
	public static void main(String[] args) 
	{
		new ClassAI().meth1();
	}
	/*
	 *Collection ==> add()--->it adds the elements
	 *List ==> add()--->it adds the elements 
	 *	ArrayList
	 *	LinkedList
	 *Queue ==> offer()--->it adds the elements
	 *	LinkedList
	 *	PriorityQueue
	*/
}
