package Demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times you want Square :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter the value for Square :");
			int num = sc.nextInt();

			System.out.println("Square of " + num + " is :" + (num * num));
		}
		sc.close();

	}

}
