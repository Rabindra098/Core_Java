package NUMBER_BASED_PROGRAMS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedUsingStreams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10);
		Integer firstNonRep = numbers.stream().collect(Collectors.groupingBy(
						n->n,java.util.LinkedHashMap::new,Collectors.counting()))
						.entrySet()
						.stream()
						.filter(e->e.getValue()==1)
						.map(Map.Entry::getKey)
						.findFirst()
						.orElseThrow();
		System.out.println(firstNonRep);
	}
}
