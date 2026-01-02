package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.List;

public class SecondLowestUsingStreams {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(50,32,53,73,96,23,64);
		Integer secondLowest = asList.stream().distinct().sorted().skip(1).findFirst().orElseThrow();
		System.out.println(secondLowest);
	}
}
