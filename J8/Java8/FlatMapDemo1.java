package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","B","C");
		List<String> list2 = Arrays.asList("D","E","F");
		List<String> list3 = Arrays.asList("G","H","I");
		List<List<String>> noOfColl = Arrays.asList(list1,list2,list3);
		List<String> collect = noOfColl.stream().flatMap(str->str.stream()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Character> collect2 = List.of("Aman","Venkatesh","Raj","Scott","Smith").stream().flatMap(str->Stream.of(str.charAt(0))).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
