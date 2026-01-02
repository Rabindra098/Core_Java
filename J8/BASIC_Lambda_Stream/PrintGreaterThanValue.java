package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.List;

public class PrintGreaterThanValue {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
		 int givenValue=20;
		 numbers.stream().filter(n-> n>givenValue).forEach(System.out::println);
	}
}
