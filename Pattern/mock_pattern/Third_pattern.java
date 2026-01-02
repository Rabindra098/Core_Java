package mock_pattern;

import java.util.Scanner;

public class Third_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		int n = sc.nextInt();

		int sp = n - 1;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || i == n || k == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}

}
