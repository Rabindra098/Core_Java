package sep26;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 5, 8, 9 }, { 9, 1, 7 } };

		int b[][] = { { 6, 8, 3 }, { 1, 9, 7 }, { 3, 5, 1 } };
		int c[][] = new int[a.length][a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int[] n : c) {
			System.out.println(Arrays.toString(n));
		}
	}
}
