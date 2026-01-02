package Recursion;
import java.util.Scanner;

public class PrimePallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isPrimePalindrome(n));
    }

    public static boolean isPrimePalindrome(int n) {
        return isPrime(n, n / 2) && isPalindrome(n, 0, n);
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) return true;
        if (n <= 1 || n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    public static boolean isPalindrome(int n, int rev, int temp) {
        if (temp == 0) return n == rev;
        return isPalindrome(n, rev * 10 + temp % 10, temp / 10);
    }
}
