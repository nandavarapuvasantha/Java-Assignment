import java.util.Arrays;

public class CheckElements {
    public static boolean containsBoth(int[] arr) {
        return Arrays.stream(arr).anyMatch(num -> num == 12) && Arrays.stream(arr).anyMatch(num -> num == 23);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 12, 15, 23, 30};
        System.out.println("Contains 12 and 23: " + containsBoth(numbers));
    }
}
