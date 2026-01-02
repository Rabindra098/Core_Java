package pattern;
import java.util.Scanner;
public class July20Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height: ");
		int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		if(i<=(n/2)+1) {
		
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
		}
		else {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
	}

}
}
