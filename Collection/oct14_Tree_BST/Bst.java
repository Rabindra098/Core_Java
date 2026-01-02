package oct14_Tree_BST;

public class Bst {
	Node root;
	int count=0;
	boolean flag=true;
	
	public boolean add(int key) {
		root=add(key,root);
		return flag;
	}
	public Node add(int key,Node n) {
		if(n==null) {
			n=new Node(key);
			count++;
			return n;
		}
		if(key<n.key) {
			n.left=add(key,n.left);
		}
		else if(key>n.key) {
			n.right=add(key,n.right);
		}
		else {
			flag=false;
		}
		return n;
	}
	public void preOrder(Node n) {
		if(n==null) return;
		
		System.out.println(n.key);
		preOrder(n.left);
		preOrder(n.right);
	}
	public void preOrder() {
		preOrder(root);
	}
	public void postOrder(Node n) {
		if(n==null) return;
		
		postOrder(n.left);
		postOrder(n.right);
		System.out.println(n.key);
	}
	public void postOrder() {
		postOrder(root);
	}
	public void inOrder(Node n) {
		if(n==null) return;
		
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
		
	}
	public void inOrder() {
		inOrder(root);
	}
	
}
