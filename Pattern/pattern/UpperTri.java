package pattern;
import java.util.Scanner;
public class UpperTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		int h = sc.nextInt();
		
		for(int i=1;i<=h;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
