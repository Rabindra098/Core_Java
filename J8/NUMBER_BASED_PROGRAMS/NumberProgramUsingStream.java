package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.List;

public class NumberProgramUsingStream {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(4, 2, 1, 5, 7, 3, 34, 66, 33, 35, 5);
		//max
		int max = asList.stream().mapToInt(Integer::intValue).max().orElseThrow();
		System.out.println(max);
		//min
		int min = asList.stream().mapToInt(Integer::intValue).min().orElseThrow();
		System.out.println(min);
		//average
		double avg = asList.stream().mapToDouble(Integer::doubleValue).average().orElseThrow();
		System.out.println(avg);
		
	}
}
