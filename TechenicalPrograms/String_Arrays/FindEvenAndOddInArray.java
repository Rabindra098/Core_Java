package String_Arrays;

import java.util.Arrays;

public class FindEvenAndOddInArray {

	public static void main(String[] args) {
		int a[]= {2,3,9,2,3,83,38,33,4};
		int even[]= new int[a.length];
		int odd[]=new int[a.length];
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<= a.length-1;i++) {
			if(a[i]%2==0) {
				even[evenCount++]=a[i];	
			}
			else {
				odd[oddCount++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(even, 0, evenCount)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(odd, 0, oddCount)));
	}
}
