package oct12_Hashing;

public class Demo1 {
	public static void main(String[] args) {
		Hashing h=new Hashing();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(10);
		h.add(12);
		h.add("Krishn");
		h.add("om");
		
		//h.display();
		//System.out.println(h.contains(90));
		h.remove(10);
		h.remove(40);
		h.display();
	}
}
