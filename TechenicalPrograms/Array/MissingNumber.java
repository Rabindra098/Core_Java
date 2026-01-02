package Array;

public class MissingNumber {
	public static void main(String[] args) {
		int []arr= {1,2,3,5,6};
		int firstind=1;
		int lastind=6;
		int sum2=0;
		for(int i=firstind; i<=lastind;i++) {
			sum2=sum2+i;
		}
		int sum1=0;
		
		for(int n:arr) {
			sum1=sum1+n;
		}
		System.out.println(sum2-sum1);
	}
}
