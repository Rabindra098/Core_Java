package String_Arrays;

public class RevereseString {
	public static void main(String[] args) {
		
		//1. using for loop
		String str1="Hello World";
		String str2=str1.replace(" ", "");
		String rev="";
		int len=str2.length();
		
		for (int i = len-1; i >=0; i--) {
			rev =rev+ str2.charAt(i);
		}
		System.out.println(rev);
		
		//2. using stringBuffre
//		StringBuffer sb = new StringBuffer("Hello World");
//		System.out.println(sb.reverse());
	}
	
}
