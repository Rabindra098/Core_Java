package Search;

public class LinearSearch {
//	public static void main(String[] args) {
//		int arr[]= {10,20,40,50};
//		int targate=30;
//		System.out.println(targate+" is Found at index num : "+linnerSerch(arr, targate));
//	}
//	public static int linnerSerch(int [] a,int target) {
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==target)
//				return i;
//		}
//		return -1;
//	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int targate=30;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==targate) {
				System.out.println("Element found at index: " + i);
				return;
			}
		}
		System.out.println("Element not found");
	}
}
