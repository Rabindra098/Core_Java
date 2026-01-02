package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.List;

public class CountElementsUsingStream {
	public static void main(String[] args) {
		List<Object> asList = Arrays.asList("Java","Hello","new",82,5,2,4);
		long count = asList.stream().count();
		System.out.println(count);
	}
}
