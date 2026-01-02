package BasicPrograms;

public class FibonaccicSeriesUsingLoop {
	public static void main(String[] args) {
		int n=30,first=0,second=1;
		System.out.print("Fabonic serice : "+first+" , "+second);
		for (int i = 2; i < n; i++) {
			int next=first+second;
			System.out.print(" , "+next);
			first=second;
			second=next;
		}
	}
}
