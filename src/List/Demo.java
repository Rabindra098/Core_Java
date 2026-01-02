package List;

import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie", "David");

		long count = names.stream()
		                  .filter(s -> s.length() >= 5)   // Intermediate
		                  .sorted()                      // Intermediate
		                  .count();                       // Terminal

		System.out.println(count); // Output: 3

	}
}
