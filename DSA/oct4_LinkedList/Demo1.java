package oct4_LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		//System.out.println(l.size());
		//
		
		//System.out.println(l.get(5));
		
		System.out.println(l);
//		l.remove(5);
//		System.out.println(l);
//		l.insert(2, 70);
//		System.out.println(l);
		l.reverse();
		System.out.println(l);
	}
}
