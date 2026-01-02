package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter(x->x%2==0).map(num->num+10).forEach(System.out::println);
		System.out.println("------------------");
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list1.stream().filter(x->x%2==0).map(num->num*num*num).collect(Collectors.toList()).forEach(System.out::println);
	}
}
