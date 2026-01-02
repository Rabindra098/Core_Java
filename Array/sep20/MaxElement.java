package sep20;

public class MaxElement {
	public static void main(String[] args) {
		int arr[]={10,40,30,50,20};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		System.out.println(max);
	}
}
