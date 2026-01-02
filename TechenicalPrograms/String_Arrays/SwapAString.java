package String_Arrays;

public class SwapAString {
	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("Before Swaping");
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		
		//append a and b
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		System.out.println("After Swaping");
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
	}
}
