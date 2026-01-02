package String_Arrays;

public class CountNumofOddAndEven {
	public static void main(String[] args) {
		long num = 12323874378659634l;
		int odd = 0;
		int even = 0;
		while (num > 0) {
			num=num/10;
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}
}
