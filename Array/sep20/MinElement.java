package sep20;

public class MinElement {
	public static void main(String[] args) {
		int arr[]={10,40,30,50,20};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
		}
		System.out.println(min);
	}
}
