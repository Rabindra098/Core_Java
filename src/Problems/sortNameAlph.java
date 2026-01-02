package Problems;
/*
Write a Java program that processes a list of names to filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.

Input : 
A List of strings: ["Toby", "Anna", "Leroy", "Alex"]
Expected Output:
Anna
Alex 
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortNameAlph {
	void meth1() {
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Toby");
//		al.add("Anna");
//		al.add("Leroy");
//		al.add("Alex");
//		System.out.println("before : "+al);
//		al.stream().filter(al->al.length()==4).limit(2).collect(Collectors.toList());
		List<String> names = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		System.out.println("Before : "+names);

		List<String> filteredNames = names.stream().filter(name -> name.length() == 4) // Filter names with exactly 4
																						// characters
				.sorted() // Sort names lexicographically
				.limit(2) // Limit output to first 2 names
				.collect(Collectors.toList());
		System.out.println("After : "+filteredNames);

	}
	public static void main(String[] args) {
		new sortNameAlph().meth1();
	}
}
