package BasicPrograms;

import java.util.Scanner;
import java.util.stream.LongStream;

public class FactorialStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial : ");
		int num=sc.nextInt();
		long fact = LongStream.rangeClosed(1, num)
				.reduce(1, (a,b)->a*b);
		System.out.println("Factorial of " + num + " = " + fact);
	}

}
