package String_Arrays;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		String name="Rabindra";
		name=name.toLowerCase();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char ch:name.toCharArray()) {
			if(map.containsKey(ch)) 
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		for(char key:map.keySet()) {
			System.out.println(key +" : "+map.get(key));
		}
	}
}
