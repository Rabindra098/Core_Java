package BasicPrograms;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a Sentence/Word : ");
        String str = sc.nextLine();

        // Convert to lowercase to simplify vowel/consonant check
        str = str.toLowerCase();

        // Counters
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if digit
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Check if space
            else if (ch == ' ') {
                spaces++;
            }
            // Check if alphabet (not vowel means consonant)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            // Ignore other characters (punctuation, symbols, etc.)
        }

        // Output results
        System.out.println("String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
