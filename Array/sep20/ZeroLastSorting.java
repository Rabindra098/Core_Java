package sep20;

import java.util.Arrays;

public class ZeroLastSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,5,0,3,0};
		int res[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				res[count++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
