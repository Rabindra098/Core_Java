package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args) {
		List<Integer> listOfNumbert = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		List<Integer> evenNum = new ArrayList<>();
		for (Integer x : listOfNumbert) {
			if(x%2==0)
				evenNum.add(x);
		}
		evenNum.forEach(System.out::println);
		//or
		System.out.println("--------------------");
		Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16).filter(x->x%2==0).forEach(System.out::println);
		System.out.println("--------------------");
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
		al.add(20);
		al.stream().filter(x->x%2==0).collect(Collectors.toSet()).forEach(System.out::println);;

	}
}
