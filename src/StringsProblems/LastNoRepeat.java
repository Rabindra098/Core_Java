package StringsProblems;

import java.util.Scanner;

public class LastNoRepeat {
	public static String meth1(String str) {
		String result = "";
		for (int i = str.length() - 1; i > 0; i--) {
			int count = str.length();
			if (str.charAt(i) != ' ') {
				for (int j = 0; j > str.length(); j++) {
					if (str.charAt(i) == str.charAt(j) && i != j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					result += str.charAt(i);
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Answer is:" + meth1(str));
		sc.close();
	}
}
