package BST;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bstt {
	Node root;
	int count = 0;
	boolean flag = true;

	public boolean add(int key) {
		root = add(key, root);
		return flag;
	}

	public Node add(int key, Node n) {
		if (n == null) {
			n = new Node(key);
			count++;
			return n;
		}
		if (key < n.key) {
			n.left = add(key, n.left);
		} else if (key > n.key) {
			n.right = add(key, n.right);
		} else {
			flag = false;
		}
		return n;
	}

	public int size() {
		return count;
	}

	public void preOrder() {
		preOrder(root);
	}

	public void postOrder() {
		postOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void preOrder(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.key);
		preOrder(n.left);
		preOrder(n.right);
	}

	public void postOrder(Node n) {
		if (n == null) {
			return;
		}
		postOrder(n.left);
		postOrder(n.right);
		System.out.println(n.key);
	}

	public void inOrder(Node n) {
		if (n == null) {
			return;
		}
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
	}

	// BFS
	public void levelOrder() {
		if (root == null)
			return;
		Queue<Node> q = new ArrayDeque<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.println(n.key);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}

	public void remove(int key) {
		root = remove(key, root);
	}

	public Node remove(int key, Node n) {
		if (n == null)
			return null;

		if (key < n.key)
			n.left = remove(key, n.left);
		else if (key > n.key)
			n.right = remove(key, n.right);
		else {
			if (n.left == null) {
				count--;
				return n.right;
			} else if (n.right == null) {
				count--;
				return n.left;
			} else {
				n.key = minEle(n.right);
				n.right = remove(n.key, n.right);
			}
		}
		return n;
	}

	public int minEle(Node n) {
		int min = n.key;
		while (n.left != null) {
			min = n.left.key;
			n = n.left;
		}
		return min;
	}
}
