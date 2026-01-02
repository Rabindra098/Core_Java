package BasicPrograms;

import java.util.Scanner;

public class PrintNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers to print: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2; // first prime number

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        sc.close();
    }

    // Method to check prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
