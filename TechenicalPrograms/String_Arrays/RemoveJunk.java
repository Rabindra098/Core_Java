package String_Arrays;

public class RemoveJunk {
	public static void main(String[] args) {
		String s="連絡してください Java Is Awesome! 098787";
		s=s.replaceAll("[^a-zA-Z0-9 !]", "");
		System.out.println(s);
	}
}
