package Recursion;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(isPrime(n,n/2));
	}
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n<=1 || n%i==0) return false;
		
		return isPrime(n,i-1);
	}

}
