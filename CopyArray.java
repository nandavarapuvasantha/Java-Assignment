import java.util.Arrays;

public class CopyArray {
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] copiedArray = copyArray(numbers);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
