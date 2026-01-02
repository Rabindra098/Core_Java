package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.List;

public class FilterEvenAndOddNumbers {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(7,6,9,92,5,7,8,9,5,35);
		//even
		asList.stream().filter(n->n%2==0).forEach(System.out::println);
		//odd
		asList.stream().filter(n->n%2!=0).forEach(System.out::println);
	}
}
