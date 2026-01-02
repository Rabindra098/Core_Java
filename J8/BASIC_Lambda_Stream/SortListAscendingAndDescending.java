package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListAscendingAndDescending  {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		//Ascending
		numbers.stream()
				.sorted()
				.collect(Collectors.toList())
				.forEach(n->System.out.println(n));
//		Descending
		numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
				.forEach(n->System.out.println(n));
	}
}
