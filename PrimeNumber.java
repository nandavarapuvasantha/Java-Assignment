public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}

