public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber > 0) {
            remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }
        System.out.println(number + (result == number ? " is an Armstrong number." : " is not an Armstrong number."));
    }
}

