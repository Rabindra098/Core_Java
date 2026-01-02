package BasicPrograms;

import java.util.Scanner;

public class DuplicateCharactersNoMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Sentence/Word : ");
		String str = sc.nextLine(); 
		// Convert to lowercase (optional)
		str = str.toLowerCase();

		// Convert string to char array
		char[] chars = str.toCharArray();

		System.out.println("Duplicate characters in \"" + str + "\":");

		// Outer loop
		for (int i = 0; i < chars.length; i++) {
			int count = 1; // count current character

			if (chars[i] == '0' || chars[i] == ' ') {
				continue; // already counted or space → skip
			}

			// Inner loop to compare with rest of characters
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
					chars[j] = '0'; // mark as visited
				}
			}

			// Print only if character occurs more than once
			if (count > 1) {
				System.out.println(chars[i] + " → " + count + " times");
			}
		}
	}
}
