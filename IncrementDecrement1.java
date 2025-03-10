public class IncrementDecrement1 {
    public static void main(String[] args) {
        int num = 10;
        incrementDecrement(num);
    }

    static void incrementDecrement(int x) {
        System.out.println("Original: " + x);
        System.out.println("After Increment: " + (++x));
        System.out.println("After Decrement: " + (--x));
    }
}
