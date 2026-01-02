package BasicPrograms;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 2 number : ");
//		int a1 = sc.nextInt();
//		int a2 = sc.nextInt();
//		if (a1 == a2)
//			System.out.println("Both number are same");
//		else if (a1 > a2)
//			System.out.println(a1 + " is greater number");
//		else if (a1 < a2)
//			System.out.println(a2 + " is greater number");
//		else
//			System.out.println("Invalid Input");
		findWhichOneIsLarger();

	}

	static void findWhichOneIsLarger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number : ");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		if (a1 == a2 && a1==a3)
			System.out.println("Three numbers are are same");
		else if (a1 > a2 && a1>a3)
			System.out.println(a1 + " is greater number");
		else if (a2 > a1 && a2>a3)
			System.out.println(a2 + " is greater number");
		else if (a3 > a2 && a3>a1)
			System.out.println(a3 + " is greater number");
		else
			System.out.println("Invalid Input");
	}
}
