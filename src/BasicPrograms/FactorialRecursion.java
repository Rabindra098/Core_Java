package BasicPrograms;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial : ");
		int num=sc.nextInt();
		System.out.println("Factorial of "+num+" = "+factorial(num));
	}
	static long factorial(int n) {
		if(n==0||n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}
