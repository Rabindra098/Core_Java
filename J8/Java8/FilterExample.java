package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		LongSummaryStatistics collect = asList.stream()
			  .filter(n->n%2==0)
			  .collect(Collectors.summarizingLong(Integer::longValue));
		System.out.println(collect);
	}
}
