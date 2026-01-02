package Parttern;

public class Triangle {
	
	void meth1() {
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void meth2() {
		int n=5;
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void meth3() {
		int n=8;
		for (int i = 1; i <= n; i++) {
			for (int space = n-i; space >= 1; space--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
//		t.meth1();
//		System.out.println("----------------------");
//		t.meth2();
//		System.out.println("----------------------");
		t.meth3();
	}
	public class RightAlignedTriangle {
	    public static void main(String[] args) {
	        int n = 5;
	        for (int i = 1; i <= n; i++) {
	            for (int space = n - i; space >= 1; space--) {
	                System.out.print("  ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}

}


