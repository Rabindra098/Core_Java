package StringsProblems;

public class CountString {
	public static void main(String[] args) {
		String str = "itamati";
		String str1="Hello World";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total Number of char in string :" + count);
	}

}
