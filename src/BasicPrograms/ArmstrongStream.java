package BasicPrograms;

import java.util.Scanner;

public class ArmstrongStream {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int n = String.valueOf(num).length();

        int sum = String.valueOf(num)
                .chars()
                .map(ch -> (int) Math.pow(ch - '0', n))
                .sum();
        System.out.println(num + (sum == num ? " is " : " is not ") + "an Armstrong number.");
    }
}
