package BasicPrograms;

public class Demo {
	public static void main(String[] args) {
		int num=4;
		if(isPrime(num) && num!=1 && num!=0 )
			System.out.println("Is Prime");
		else
			System.out.println("Not Prime");
	}
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num/2; i++) {
			if(num%2==0)
				return false;
		}
		return true;
	}
}
