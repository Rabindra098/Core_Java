package org.pattern;

import java.util.Scanner;

public class Pattern01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		for (int r = 1; r <= num; r++) {
			for (int c = 1; c <= num; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
