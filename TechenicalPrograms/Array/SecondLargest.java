package Array;

public class SecondLargest {
	public static void main(String[] args) {
		int []arr= {6,3,4,2,8,9,26,43};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int n:arr) {
			if(n>largest) {
				second=largest;
				largest=n;
			}
			else if (n>second && n != largest) {
				second=n;
			}
		}
		System.out.println(largest);
		System.out.println(second);
	}
}
