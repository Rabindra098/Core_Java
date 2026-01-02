package Java8;

import java.util.List;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> num = List.of(1,2,3,4,5);
		//map()
		List<Integer> list = num.stream().map(n->n*2).toList();
		System.out.println(list);
		//filter()
		List<Integer> list2 = num.stream().filter(n->n%2==0).toList();
		System.out.println(list2);
		//flatMap()
		List<List<Integer>> num1 = List.of(List.of(1,2,3,4,5),List.of(1,2,3,4,5),List.of(1,2,3,4,5),List.of(1,2,3,4,5));
		List<Integer> flatMap = num1.stream().flatMap(l->l.stream()).sorted().toList();
		System.out.println(flatMap);
	
	}
}
