package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
	public static void main(String[] args) {
		List<String> listOfName =
				Arrays.asList("Rahul","Ankit","Raj","Roshan","Scott");
		
		listOfName.stream()
					.filter(str->str.startsWith("S"))
					.collect(Collectors.toList())
					.forEach(System.out::println);
		System.out.println("---------------");
		
		Stream<String> names =
				Stream.of("Ravi","Rahul","Ankit","Raj","Roshan","Scott","Rahul","Raj");
		names.filter(str->str.startsWith("R")).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------");
		
		List<String> name =
				Arrays.asList("Zaheer","Rahul","Aryan","Sailesh","Zaheer");
				List<String> sortedName =
				 name.stream().sorted().collect(Collectors.toList());
				 System.out.println(sortedName);


	}
}
