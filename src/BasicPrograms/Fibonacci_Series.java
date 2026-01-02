package BasicPrograms;

public class Fibonacci_Series {

	void withoutRecursion() {
		int a=0;
		int b=1;
		int c;
		int count=10;
		System.out.print(a+" "+b);
		for (int i = 2; i < count; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	void withRecursion(int count) {
		
	}
	public static void main(String[] args) {
		Fibonacci_Series fs=new Fibonacci_Series();
		fs.withoutRecursion();
		int count=10;
		int a=0;
		fs.withRecursion(count-2);
	}

}
