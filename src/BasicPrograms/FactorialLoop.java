package BasicPrograms;

import java.util.Scanner;

public class FactorialLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial : ");
		int num=sc.nextInt();
		long fact=1;
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}

}
