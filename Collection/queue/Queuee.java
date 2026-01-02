package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> q=new ArrayDeque<Integer>();
		q.add(50);
		q.add(30);
		q.add(90);
		//q.add(null);
		q.add(10);
		
//	while(!q.isEmpty()) {
//		System.out.println(q.poll());
//	}
		System.out.println(Arrays.toString(q.toArray()));
		//System.out.println(q.pollLast());
	}

}
