package pattern;
import java.util.Scanner;
public class CharNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height :");
		int n = sc.nextInt();
		char count = 'A';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(count+" ");
					count++;
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
	}
}