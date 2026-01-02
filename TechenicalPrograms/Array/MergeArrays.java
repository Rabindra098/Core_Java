package Array;

public class MergeArrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] result = new int[a.length + b.length];

		int k = 0;
		for (int i : a)
			result[k++] = i;
		for (int j : b)
			result[k++] = j;

		System.out.println("Merged Array:");
		for (int x : result)
			System.out.print(x + " ");
	}
}
