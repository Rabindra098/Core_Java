package mock_pattern;
import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height: ");
		int n=sc.nextInt();
		
		int sp=n-1;
		int st=1;
		int num = 2; 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			 int count = 0;
	            
	            while (count < st) {
	                if (isPrime(num, num / 2)) {
	                    System.out.print(num + " ");
	                    count++;
	                }
	                num++;
	            }
			if(i<=n/2) {
				st+=2;
				sp--;
			}
			else {
				st-=2;
				sp++;
			}
			System.out.println();
		}
		
	}
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		
		if(n<=1 || n%i==0) return false;
		
		return isPrime(n,i-1);
	}

}
