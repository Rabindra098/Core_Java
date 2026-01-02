package Array;

public class PairSum {
	public static void main(String[] args) {
		int []arr= {3,10,2,6,6,4,5,7};
		int targate=12;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==targate) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+targate);
				}
			}
		}
	}
}
