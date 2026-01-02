package BasicPrograms;

public class ArmstrongSeries {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			int n = String.valueOf(i).length();
			int sum = 0, temp = i;

			while (temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, n);
				temp /= 10;
			}
			if (sum == i)
				System.out.println(i);

		}
	}
}
