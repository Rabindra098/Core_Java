package Problems;

public class ClassZ {
	public static void main(String[] args) {
		Object arr[] = { 1 };
		for (Object object : arr) {
			System.out.print(object + " ");
		}
		System.out.println("\nLength of the Array is :" + (arr.length));
		if (arr.length == 0) {
			System.out.println("Length is 0");
		} else if (arr.length == 1) {
			System.out.println(arr[0]);
		} else if (arr.length == 2) {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
		} else {
			System.out.println("Invalid out put");
		}
	}

}
