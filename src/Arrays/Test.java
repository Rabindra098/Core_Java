package Arrays;

public class Test {
	public static void main(String[] args) {
		String[] arr = { "4", "2", "8", "11", };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[j]))
					count++;
			}
			System.out.println(arr[i]+" having "+count);
		}
	}

}
