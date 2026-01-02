package String;

public class StringToInt {
	public static void main(String[] args) {
		String str = "Hello";
		int num = 0;
		for (char c : str.toCharArray()) {
			num = num * 10 + (c - '0');
		}
		System.out.println(num);
	}
}
