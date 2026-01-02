package Demo;

public class SumOfNaturalNumber {
	static long sumOfNaturalNumber(long n) {
		if(n==0) {
			return 0;
		}
		return n+ sumOfNaturalNumber(n-1);
	}
	public static void main(String[] args) {
		long n=8648l;
		long result=sumOfNaturalNumber(n);
		  System.out.println("Sum of first " + n + " natural numbers = " + result);
	}

}
