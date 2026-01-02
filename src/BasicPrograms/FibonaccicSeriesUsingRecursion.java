package BasicPrograms;

public class FibonaccicSeriesUsingRecursion {
	public static void main(String[] args) {
		int n=39;
		System.out.print("Fabonaccie serice : ");
		for (int i = 0; i < n; i++) {
			System.out.print(fabonaccie(i)+" ");
		}
	}
	static int fabonaccie(int n) {
		if(n<=1)
			return n;
		return fabonaccie(n-1)+fabonaccie(n-2);
	}
}
