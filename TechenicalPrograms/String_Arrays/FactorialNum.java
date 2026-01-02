package String_Arrays;

public class FactorialNum {
	public static void main(String[] args) {
		//in ascending order
		int num1 = 35;
		long fact1 = 1;
		for (int i = 1; i <= num1; i++) {
			fact1 *= i;
		}
		System.out.println(fact1);
		//in ascending order
		int num2=10;
		long fact2=1;
		for (int i = num2; i >=1; i--) {
			fact2*=i;
		}
		System.out.println(fact2);
	}
}
