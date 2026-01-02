package pattern;
import java.util.Scanner;
public class NthFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth digit Fibonacci number: ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=1;true;i++) {
			if(i==n) {
				System.out.println(n1);
				break;
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
