package pattern;

import java.util.Scanner;

public class Critical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		int n = sc.nextInt();
		int count = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(count + " ");
					count++;
				}
			} else {
				for (int j = count + 1; j >= i; j--) {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}

}
