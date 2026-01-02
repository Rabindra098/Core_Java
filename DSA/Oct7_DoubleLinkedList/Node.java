package Oct7_DoubleLinkedList;

public class Node {
	Object ele;
	Node next;
	Node prev;
	
	public Node(Object e,Node n,Node p) {
		ele=e;
		next=n;
		prev=p;
	}
}
