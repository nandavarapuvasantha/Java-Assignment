public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121, reversed = 0, original = number, remainder;
        while (number > 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        System.out.println(original + (original == reversed ? " is a palindrome." : " is not a palindrome."));
    }
}

