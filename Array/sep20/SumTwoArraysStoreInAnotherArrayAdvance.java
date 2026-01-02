package sep20;

import java.util.Arrays;

public class SumTwoArraysStoreInAnotherArrayAdvance {
    public static void main(String[] args) {
        int a[]={1,2,3,5,9,3,7};
        int b[]={5,6,7,9,5};
        int n=a.length>b.length?a.length:b.length;
        int c[]=new int[n];

        
        int len=a.length>b.length?b.length:a.length;
        
        for (int i=0;i<len;i++) {
            c[i]=a[i]+b[i];  
        }
        if(b.length>a.length) {
        	for(int j=len;j<b.length;j++) {
        		c[j]=b[j];
        	}
        }
        else {
        	for(int j=len;j<a.length;j++) {
        		c[j]=a[j];
        	}
        }

        System.out.println(Arrays.toString(c));
    }
}
