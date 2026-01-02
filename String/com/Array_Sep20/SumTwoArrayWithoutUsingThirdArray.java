package com.Array_Sep20;

import java.util.Arrays;

public class SumTwoArrayWithoutUsingThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {1,2,3,4,5};
		
		int n=a.length<b.length?a.length:b.length;
		
		for(int i=0;i<n;i++) {
			if(a.length<b.length) {
				b[i]+=a[i];
			}
			else {
				a[i]+=b[i];
			}
		}
		if(a.length<b.length) {
			System.out.println(Arrays.toString(b));
		}
		else {
			System.out.println(Arrays.toString(a));
		}
	}

}
