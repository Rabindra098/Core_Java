package oct10_Collections;

import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		String s = "[{()}]";
		// String s="[{]}";

		System.out.println(isBalance(s));
	}

	public static boolean isBalance(String s) {
		Stack<Character> s1 = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			if (ch1 == '(' || ch1 == '{' || ch1 == '[') {
				s1.push(ch1);
			} else if (ch1 == ')' || ch1 == '}' || ch1 == ']') {
				if (s1.isEmpty() || !match(s1.pop(), ch1)) {
					return false;
				}
			}
		}
		return s1.isEmpty();
	}

	public static boolean match(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')')
			return true;
		if (ch1 == '{' && ch2 == '}')
			return true;
		if (ch1 == '[' && ch2 == ']')
			return true;
		return false;
	}
}
