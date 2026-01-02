package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstRepeatedUsingStreams {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10);
		 HashSet<Integer> seen = new HashSet<>();
		 Integer firstRep = numbers.stream().filter(n-> !seen.add(n)).findFirst().orElse(null);
		 System.out.println(firstRep);
	}
}
