package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		 List<String> names = Arrays.asList("java", "spring", "hibernate", "microservices");
		 List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		 System.out.println(collect);
	}
}
