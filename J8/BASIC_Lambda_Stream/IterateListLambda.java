package BASIC_Lambda_Stream;

import java.util.Arrays;
import java.util.List;

public class IterateListLambda {
	public static void main(String[] args) {
		List<Object> asList = Arrays.asList("Hello","Java","Karan",7,6,9,92);
		// Iterating using lambda expression
		asList.forEach(name->System.out.println(name));
		
		//Iterating using method reference
//		asList.forEach(System.out::println);
		
		//Iterating using stream api
		asList.stream().forEach(System.out::println);
		
	}
}
