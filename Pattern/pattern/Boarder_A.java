package pattern;
import java.util.Scanner;
public class Boarder_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height :");
		int n = sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n ) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}