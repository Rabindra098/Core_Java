package Arrays;

public class ConvertStringToArray {
	public static void main(String[] args) {
		String str= "Check De! India ..";
		char [] arr=str.toCharArray();
		for (char c : arr) {
			System.out.print(c+" ");
		}
	}
}
