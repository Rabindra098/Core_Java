package String_Arrays;

public class ReverseInteger {
	public static void main(String[] args) {
		//1. using while loop
		long num=1234569068975877864l;
		long rev=0;
		while (num !=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		//2. using stringBuffre
		int num1=12345;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
	}
}
