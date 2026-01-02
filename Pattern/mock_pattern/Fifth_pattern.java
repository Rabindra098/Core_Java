package mock_pattern;

import java.util.Scanner;

public class Fifth_pattern {

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
			for (int k = 1; k < st; k++) {
				System.out.print(k);
			}
			for (int l = st; l >= 1; l--) {
				System.out.print(l);
			}
			if (i <= n / 2) {
				sp--;
				st++;
			} else {
				sp++;
				st--;
			}
			System.out.println();
		}
	}
}
