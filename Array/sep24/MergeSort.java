package sep24;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int a[]= {5,7,4,9,1,8,2};
		divide(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void divide(int a[]) {
		if(a.length==1) return;
		int left[]=new int[a.length/2];
		int right[]=new int[a.length-left.length];
		
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		divide(left);
		divide(right);
		merge(left,right,a);
	}
	
	
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
			while(i<a.length) {
				c[k]=a[i];
				i++;
				k++;
			}
			while(j<b.length) {
				c[k]=b[j];
				j++;
				k++;
			}
		
		
	}
}
