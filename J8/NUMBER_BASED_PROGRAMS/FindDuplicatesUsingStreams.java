package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 30);
		Set<Integer> seen = new HashSet<>();

        // Find duplicate numbers
        Set<Integer> duplicates = numbers.stream()
                                          .filter(n -> !seen.add(n))
                                          .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);
	}
}
