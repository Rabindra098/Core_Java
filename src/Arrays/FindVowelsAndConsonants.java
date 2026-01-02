package Arrays;

public class FindVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "Check De! India.....";
		String lowerCase = str.toLowerCase();
		int vowels=0, consonants=0;
		for (int i = 0; i < lowerCase.length(); i++) {
			char ch = lowerCase.charAt(i);
			if (ch != ' ' && (ch >= 'a' && ch <= 'z')) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("vowels :"+vowels);
		System.out.println("consonants :"+consonants);
	}
}
