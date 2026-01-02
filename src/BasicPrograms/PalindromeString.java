package BasicPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		if (isPalindrome(str)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}
	}
	static boolean isPalindrome(String str) {
		String reverse="";
		for (int i = str.length()-1; i >=0; i--) {
			reverse +=str.charAt(i);
		}
		return str.equalsIgnoreCase(reverse);
	}
}
