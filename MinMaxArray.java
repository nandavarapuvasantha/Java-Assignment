import java.util.Arrays;

public class MinMaxArray {
    public static int[] findMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 50};
        int[] result = findMinMax(numbers);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}
