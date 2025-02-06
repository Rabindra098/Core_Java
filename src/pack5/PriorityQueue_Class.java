package pack5;

import java.util.PriorityQueue;

public class PriorityQueue_Class 
{
	public void meth1() 
	{
		System.out.println("Implementing PriorityQueue");
		PriorityQueue<Object>pq = new PriorityQueue<Object>();
		pq.add(10);		//Insertitin order mot maintained
		//pq.offer("Jvav");//Heterogeneous data is not allowed
		//pq.add(null);	//null values is not allowed
		pq.offer(8);	//duplicate values are allowed
		//pq.add(true);	//It is avaleable in Java 1.5v
		//pq.offer('A')	//Its default capacity is 11
		pq.add(200);	//It is increased by double
		pq.offer(140);	//It is not sychronized 
		pq.add(73);
		pq.add(74);
		System.out.println(pq);
		System.out.println("\nremove() : "+pq.remove());
		System.out.println(pq);
		System.out.println("\npoll() : "+pq.poll());
		System.out.println(pq);
		//pq.clear();
		//System.out.println("\nremove() : "+pq.remove());
		//System.out.println("\npoll() : "+pq.poll());
		System.out.println(pq);
		System.out.println("\npeak() : "+pq.peek());
		System.out.println(pq);
	}
	public static void main(String[] args) 
	{
		new PriorityQueue_Class().meth1();
	}
}

