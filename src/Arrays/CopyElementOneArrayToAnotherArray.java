package Arrays;

public class CopyElementOneArrayToAnotherArray {
	public static void main(String[] args) {
		int [] arr1= {2,43,4,2,4,6,4,3};
		int [] arr2=new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("arr1 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.print("\narr2 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
