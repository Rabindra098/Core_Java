package sep20;

import java.util.Arrays;

public class ZeroFirstSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,5,0,3,0};
		int res[]=new int[arr.length];
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				res[count--]=arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
