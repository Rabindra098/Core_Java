package String_Arrays;

public class CheckNumPrimeOrNot {
	public static boolean isPrimeNum(int n) {
		if(n<=1)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int num=7;
		if(isPrimeNum(num))
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
	}
	
}
