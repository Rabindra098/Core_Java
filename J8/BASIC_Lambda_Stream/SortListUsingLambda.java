package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListUsingLambda {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		Collections.sort(numbers,(a,b)->a.compareTo(b));
		System.out.println(numbers);
	}
}
