package BasicPrograms;

import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Printing Prime Number in between Range");
    	System.out.print("Enter a numbe starts with : ");
    	int start=sc.nextInt();
    	System.out.print("Enter a numbe ends with : ");
    	int end=sc.nextInt();
    	for (int i = start; i < end; i++) { 
    		if (isPrime(i)) {
    			System.out.print(i+" ");
    		}
		}
    	
    }
    static boolean isPrime(int num) {
    	if(num<=1) return false;
    	for (int i = 2; i <= Math.sqrt(num) ; i++) {
    		if (num%i==0) 
    			return false;
		}
    	return true;
    }
}

