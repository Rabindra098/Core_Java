package ADVANCED_LOGICAL;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated {
	public static void main(String[] args) {
		int []arr= {3,4,6,8,4,5,8,64,4,3,3,45,6,67};
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int n:arr)
			map.put(n, map.getOrDefault(n, 0)+1);
		for(Map.Entry<Integer,Integer> e:map.entrySet()) {
			if (e.getValue() == 1) {
                System.out.println("First Non-Repeated: " + e.getKey());
                break;
            }
		}
	}
}
