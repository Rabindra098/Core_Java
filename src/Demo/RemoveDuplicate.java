package Demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 40, 40, 50 };

		// Use LinkedHashSet to maintain insertion order
		Set<Integer> set1 = new HashSet<>();
		for (int num : arr) {
			set1.add(num);
		}

		System.out.println("Array without duplicates: " + set1);

		// ✅ Convert int[] to Integer[] first
		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		// ✅ Use HashSet to remove duplicates
		Set<Integer> set2 = new HashSet<>(Arrays.asList(boxedArray));

		System.out.println("Array without duplicates: " + set2);
	}
}
