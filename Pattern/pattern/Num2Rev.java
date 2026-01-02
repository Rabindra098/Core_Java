package pattern;
import java.util.Scanner;
public class Num2Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height :");
		int n = sc.nextInt();
		
		
		for( int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2!=0) {
					System.out.print((i-1)*n+j+" ");
				}
				else {
					System.out.print(i*n-j+1+" ");
					
				}			
			}
			
			System.out.println();
			
		}
	}
}