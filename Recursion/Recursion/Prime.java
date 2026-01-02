package Recursion;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(5);
	}
		static void prime(int n) {
			
			if(n<=1) {
				System.out.println("Not prime"); return;
			}
			
			for(int i=2;i<=n/2;i++) {
							
				if(n%i==0) {
					System.out.println("Not Prime"); return;
				}
			}
			System.out.println("Prime");
		}
}
