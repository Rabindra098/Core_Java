package String;

public class WordCount {
	public static void main(String[] args) {
		String str="Java is Very Awesome !";
		String[] word = str.trim().split("\\s+");
		int count=0;
		String str1 =str.trim();
		System.out.println(word.length);
		for(char c:str1.toCharArray()) {
			if(c==' ')
				count++;
		}
		System.out.println(count+1);
	}
}
