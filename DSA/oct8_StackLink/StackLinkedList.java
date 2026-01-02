package oct8_StackLink;

import java.util.EmptyStackException;

public class StackLinkedList {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e);
		last=last.next;
		count++;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int size() {
		return count;
	}
	
	public Object peek() {
		if(isEmpty()) throw new EmptyStackException();
		return last.ele;
	}
	
	public Object poll() {
		if(isEmpty()) throw new EmptyStackException();
		Object e=last.ele;
		if(first==last) {
			first=null;
			last=null;
			count--;
			return e;
		}
		Node curr=first;
		while(curr.next!=last) {
			curr=curr.next;
		}
		last=curr;
		last.next=null;
		count--;	
		
		return e;
	}
}
