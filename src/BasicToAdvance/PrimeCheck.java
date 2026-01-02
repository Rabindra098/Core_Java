package BasicToAdvance;

public class PrimeCheck {

    public static void main(String[] args) {
        int num = 0;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + " is prime? " + isPrime);
    }
}
