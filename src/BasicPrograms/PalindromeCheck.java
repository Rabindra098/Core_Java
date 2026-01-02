package BasicPrograms;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name/Text : ");
		String str = sc.next();
		str.toLowerCase();
		boolean isPalindrome=true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println(str+ " is a Palindrome");
		} else {
			System.out.println(str + " is NOT a Palindrome");
		}
	}
}
