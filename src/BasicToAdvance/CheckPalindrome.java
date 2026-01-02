package BasicToAdvance;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str="Madam";
		String str1=str.toLowerCase();
		String check=new StringBuilder(str1).reverse().toString();
		System.out.println(str1.equals(check));
	}
}
