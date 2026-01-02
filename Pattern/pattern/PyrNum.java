package pattern;

public class PyrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sp=n-1;
		int st=1;
		char ch='A';
		int num=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++)System.out.print("  ");
			
			
			for(int k=1;k<=st;k++) {
				if(k==1||i==n||k==st) {// i-1==k-i
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
			sp--;
			st+=2;
		}
	}

}
