package Demo;

public class Factorial {
	static long claculateFat(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n * claculateFat(n-1); 
		}
	}
	public static void main(String[] args) {
		int n=12;
		long result=claculateFat(n);
		System.out.println(n+" factorial is : "+result);
	}
}
