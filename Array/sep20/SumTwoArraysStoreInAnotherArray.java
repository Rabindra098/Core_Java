package sep20;

import java.util.Arrays;

public class SumTwoArraysStoreInAnotherArray {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={5,6,7};
        int c[]=new int[a.length];

        for (int i=0;i<a.length;i++) {
            c[i]=a[i]+b[i];  
        }

        System.out.println(Arrays.toString(c));
    }
}
