package oct8_StackLink;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList s=new StackLinkedList();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		//System.out.println(s.peek());
		System.out.println(s.poll());
		System.out.println(s.poll());
		System.out.println(s.poll());
		System.out.println(s.poll());
		System.out.println(s.poll());
		
	}

}
