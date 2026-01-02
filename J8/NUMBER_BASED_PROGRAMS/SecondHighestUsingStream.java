package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.List;

public class SecondHighestUsingStream {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 30, 40);
		Integer secondLagest = numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().orElseThrow();
		System.out.println(secondLagest);
	}
}
