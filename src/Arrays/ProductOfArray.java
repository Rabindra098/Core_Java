package Arrays;

public class ProductOfArray {
	public static void main(String[] args) {
		int [] arr= {2,4,4,6,3,7,9};
		int product=1;
		for (int i = 0; i < arr.length; i++) {
			product=product*arr[i];
		}
		System.out.println(product);
	}
}
