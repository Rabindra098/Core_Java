package String_Arrays;

public class FindMissingArray {
	public static void main(String[] args) {
		int []a= {1,2,3,4,6};
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		int sum2=0;
		for (int j = 1; j <= 6; j++) {
			sum2=sum2+j;
		}
		System.out.println(sum2);
		System.out.println("Missing number is : "+(sum2-sum1));
	}
}
