package String_Arrays;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=10;
		int num1=0,num2=1,sum;
		System.out.print(num1+" "+num2);
		for (int i = 2; i < 10; i++) {
			sum=num1+num2;
			System.out.print(" "+sum);
			num1=num2;
			num2=sum;
		}
		
	}
}
