import java.util.Arrays;

public class MinMaxDifference {
    public static int getDifference(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 50};
        System.out.println("Difference: " + getDifference(numbers));
    }
}
