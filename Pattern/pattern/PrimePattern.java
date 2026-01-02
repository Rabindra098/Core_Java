package pattern;
import java.util.Scanner;

public class PrimePattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height: ");
        int n=sc.nextInt();
        int count=2;

        for (int i=1;i<=n;i++) {
           int j=1;
           while(j<=n) {
                if (isPrime(count, count/2)) {
                    System.out.print( count+" "); 
                    j++;
                } 
                count++;  
           }
            System.out.println(); 
        }
    }
    public static boolean isPrime(int n, int i) {
        if (i==1) return true;
        if (n<=1 || n%i==0) return false;
        return isPrime(n, i-1);
    }
}
