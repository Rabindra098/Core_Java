package String_Arrays;

public class SwapWithoutUsingVar {
	public static void main(String[] args) {
		int x=5;
		int y=10;
		System.out.println("Before x value : "+x);
		System.out.println("Before y value : "+y);
		
		//1. using var
//		int t;
//		t=x;
//		x=y;
//		y=t;
		
//		//2. using + operator
//		x=x+y;
//		y=x-y;
//		x=x-y;
		
		//3. using * operator
//		x=x*y;
//		y=x/y;
//		x=x/y;
		 
		//4. using ^ operator
		x=x^y;
		y=x^y;
		x=x^y;
		
		
		System.out.println("After x value : "+x);
		System.out.println("After y value : "+y);
		
		
		
	}
}
