package pattern;

import java.util.Scanner;

public class PrimePatternCopy {
	// Utility function to check prime
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height:");
		int n = sc.nextInt();

		int count = 0, number = 2;
		for (int i = 1; i <= n; i++) { // Row
			for (int j = 1; j <= i; j++) { // Elements in Row
				while (!isPrime(number)) {
					number++;
				}
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}
