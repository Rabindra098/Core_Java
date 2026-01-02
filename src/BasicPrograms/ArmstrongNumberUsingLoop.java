package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumberUsingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int originalNum = num;
		int result = 0;
		int n = String.valueOf(num).length();
		while (num > 0) {
			int digit = num % 10;
			result += Math.pow(digit, n);
			num /=10;
		}
		if (result == originalNum)
			System.out.println(originalNum + " is a ArmstrongNumber");
		else
			System.out.println(originalNum + " is not a ArmstrongNumber");
	}

}
