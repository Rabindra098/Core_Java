package ADVANCED_LOGICAL;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {
	public static void main(String[] args) {
		int []arr= {3,5,2,7,8,9,3,2};
		Set<Integer> set = new HashSet<>();
		for(int n:arr) {
			if(!set.add(n)) {
				System.out.println("First Repeted Num : "+n);
				return;
			}
		}
		System.out.println("There is no Repeted Number");
	}
}
