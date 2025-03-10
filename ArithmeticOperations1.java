public class ArithmeticOperations1 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        arithmeticOperations(a, b);
    }

    static void arithmeticOperations(int x, int y) {
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
    }
}
