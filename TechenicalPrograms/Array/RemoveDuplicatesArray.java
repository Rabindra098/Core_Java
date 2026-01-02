package Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		int [] arr= {5,2,34,5,6,4,3,4,44,5,5,4,3,77,3,2,2,83,2,2,3,3,4,4,};
		Set<Integer> set = new LinkedHashSet<>();
		for(int n:arr) {	
			set.add(n);
		}
		System.out.println(set);
	}
}
