package mock_pattern;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		int n = sc.nextInt();

		int num = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(num + " ");
					num++;
				}
			} else {
				int last = num + i - 1;
				for (int k = last; k >= num; k--) {
					System.out.print(k + " ");
				}
				num = last + 1;
			}
			System.out.println();
		}
	}

}
