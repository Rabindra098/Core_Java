package List;

import java.util.ArrayList;
import java.util.Vector;

public class PerformanceComparison {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 1000000; i++) {
			al.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by ArrayList :" + (endTime - startTime) + " ms");
		Vector<Integer> v = new Vector<Integer>();
		long startTime1 = System.currentTimeMillis();
		for (int i = 1; i <= 1000000; i++) {
			v.add(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken by Vector :" + (endTime1 - startTime1) + " ms");
	}
}
