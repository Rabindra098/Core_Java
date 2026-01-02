package oct12_Hashing;

public class Hashing {
	private Node[] a=new Node[10];
	private int count=0;
	
	public boolean add(Object key) {
		int hc=Math.abs(key.hashCode());
//		if(hc<0) hc=hc*(-1);
		
		int index=hc%a.length;
		
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) return false;
			
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
	public boolean contains(Object key) {
		int hc=Math.abs(key.hashCode());		
		int index=hc%a.length;
		Node curr=a[index];
		
		while(curr!=null) {
			if(curr.key.equals(key)) return true;
			curr=curr.next;
		}
		return false;
	}
	public void remove(Object key) {
		int hc=Math.abs(key.hashCode());		
		int index=hc%a.length;
		Node curr=a[index];		
		Node prev=null;
		
		while(curr!=null) {
			if(curr.key.equals(key)) {
				if(prev==null) {
					a[index]=curr.next;
				}
				else {
					prev.next=curr.next;
				}
				count--;
				return;
			}
			prev=curr;
			curr=curr.next;
		}
	}
}
