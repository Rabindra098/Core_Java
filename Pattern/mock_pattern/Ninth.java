package mock_pattern;
import java.util.Scanner;
public class Ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height: ");
		int n=sc.nextInt();
			
		int num=2;
		
		for(int i=1;i<=n;i++) {
			int j=0;
			while(j<i) {
				if(isPrime(num,num/2)) {
					System.out.print(num+" ");
					j++;
				}
				num++;
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
