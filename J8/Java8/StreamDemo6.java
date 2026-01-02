package Java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo6 {
	public static void main(String[] args) {
		Stream<String> listOfFruits = Stream.of("Apple", "Mango", "Grapes", "Kiwi", "pomogranate");
		List<Integer> collect = listOfFruits.peek(str -> System.out.println(str.toUpperCase())).map(str -> str.length())
				.collect(Collectors.toList());
		System.out.println(collect);
		// takeWhile Method
		Stream<Integer> numbers = Stream.of(10, 6, 9, 13, 1, 2, 3, 2, 1, 100);
		numbers.takeWhile(n -> n > 2).forEach(System.out::println);
		Stream<String> stream = Stream.of("Ravi", "Ankit", "Rohan", "Aman", "Ravish");
		stream.takeWhile(str -> str.charAt(0) == 'R').forEach(System.out::println);

		Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		nums.dropWhile(num -> num < 5).forEach(System.out::println);
		System.out.println("..................................");
		nums = Stream.of(15, 8, 7, 9, 5, 6, 7, 8, 9, 10);
		nums.dropWhile(num -> num > 5).forEach(System.out::println);

	}
}
