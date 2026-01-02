package Oct7_DoubleLinkedList;

public class DoubleLinkedList {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null,last);
		last=last.next;
		count++;
	}
	public int size() {
		return count;
	}
	

	@Override
	public String toString() {
		if(size()==0) return "[]";
		
		String s="["+first.ele;
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
			s=s+","+curr.ele;
		}
		s=s+"]";
		return s;
	}
	public void reverse() {
		Node curr=first;
		Node temp=null;
		
		while(curr!=null) {
		temp=curr.next;
		curr.next=curr.prev;
		curr.prev=temp;
		curr=curr.prev;
		}
		Node swap=first;
		first=last;
		last=swap;
		
	}
	
	
	
	
}
