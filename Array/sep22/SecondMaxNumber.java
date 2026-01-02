package sep22;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,6,45,67,23,67,9,41};
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}

}
