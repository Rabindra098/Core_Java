package Oct7_DoubleLinkedList;

public class Demo1 {
	public static void main(String[] args) {
		DoubleLinkedList l = new DoubleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		System.out.println(l);
		l.reverse();
		System.out.println(l);
	}
}
