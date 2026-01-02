package String_Arrays;

public class CountVowelsInString {
	public static void main(String[] args) {
		String str="Hyy Java! Java Is Always Awesome!";
		int count=0;
		for(char c: str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c) != -1)
				count++;
		}
		System.out.println(count);
	}
}
