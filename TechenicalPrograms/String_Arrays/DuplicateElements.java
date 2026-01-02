package String_Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		String [] names= {"Java","Python","React","Spring","C","Java","AWS","C"};
		//1. using forLoop
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate element : "+names[i]);
				}
			}
		}
		//2. using HashSet
		HashSet<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name)==false) {
				System.out.println("Duplicate element : "+name);
			}
		}
		
		//3. using HashMap
		Map<String,Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if(count==null)
				storeMap.put(name, 1);
			else
				storeMap.put(name, ++count);
		}
		//get value for the HashMap
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1)
				System.out.println("Duplicate Element is "+entry.getKey());
			
		}
		
	}
}
