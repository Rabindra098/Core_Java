package practice;

import java.util.Arrays;

public class SumInSameArray {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				    {4,5},
				    {7,8,9}};
		
		int b[][]= {{11,23,3},
				    {41,54,61},
				    {72,81,9}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[i][j] + b[i][j];
			}
		}
		for(int[] ele:b) {
			System.out.println(Arrays.toString(ele));
		}
	}
}
