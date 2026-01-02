package sep20;

import java.util.Arrays;

public class SumTwoArraysWithoutStoreInAnotherArrayAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6,7,9};
		
		int n=a.length>b.length?b.length:a.length;
		
		for(int i=0;i<n;i++) {
			if(a.length>b.length) {
				a[i]+=b[i];
			}
			else {
				b[i]+=a[i];
			}
		}
		if(a.length>b.length) {
			System.out.println(Arrays.toString(a));
		}
		else {
			System.out.println(Arrays.toString(b));
		}
	}

}
