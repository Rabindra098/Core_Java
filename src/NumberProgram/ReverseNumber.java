package NumberProgram;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=83476;
		int reverse=0;
		while (number!=0) {
			int digit=number%10;	 // Extract the last digit of the number
			reverse=reverse*10+digit;// Append the digit to the reversed number
			number=number/10;			// Remove the last digit from the original number
		}
		System.out.println(reverse);
	}
}
