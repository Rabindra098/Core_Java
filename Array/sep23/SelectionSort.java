package sep23;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {4,7,9,1,3};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

public static void sort(int a[]) {
	for(int i=0;i<a.length;i++) {
		int smallEleIndex=i;
		
		for(int j=i+1;j<a.length;j++) { 
			if(a[j]<a[smallEleIndex]) {
				smallEleIndex=j;
			}
		}
		int temp=a[i];
		a[i]=a[smallEleIndex];
		a[smallEleIndex]=temp;
	}
}
}
