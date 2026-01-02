package Recursion;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(m1(10));
	}

	static int m1(int n) {

		if (n < 0)
			return 0;

		return n + m1(n - 1);

	}
}
