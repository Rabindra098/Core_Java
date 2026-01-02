package Demo;

public class PrintOneToNthNumber {
	public static void main(String[] args) {
		int n=10;
		System.out.print("ForwardOrder:: ");
		ForForwordOrder(n);
		System.out.println();
		System.out.print("ReverceOrder:: ");
		ForReverceOrder(n);
	}
	public static void ForForwordOrder(int n) {
		if(n==0) {
			return;
		}
		ForForwordOrder(n-1);
		System.out.print(n+" ");
	}
	public static void ForReverceOrder(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		ForReverceOrder(n-1);
	}
}
