package oct3_ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		// obj.add(10.0);//If i give int parameter, it wont do widening-->CTE
//		obj.add("Om");
//		obj.add("Guddu");
//		obj.add("Gulu");
//		obj.add("Babu");
		obj.add(50);
		obj.add(90);
		obj.add(10);
		obj.add(50);
		obj.add(30);

//	for(int i=0;i<obj.size();i++) {
//		System.out.println(obj.get(i));
//	}
//	System.out.println("----------------------------");
//	obj.insert(1, 90);
//	for(int i=0;i<obj.size();i++) {
//		System.out.println(obj.get(i));
//	}
//	System.out.println("----------------------------");
//	
//	System.out.println(obj.get(3));
//	
//	System.out.println("----------------------------");
//	
//	obj.remove(4);
//	for(int i=0;i<obj.size();i++) {
//		System.out.println(obj.get(i)); //System.out.println((Integer)obj.get(i));
//	}
		// System.out.println(obj.get(0));
//		for(int i=0;i<obj.size();i++) {
//			System.out.println(obj.get(i));
//		}
		System.out.println(obj);
	}
}
