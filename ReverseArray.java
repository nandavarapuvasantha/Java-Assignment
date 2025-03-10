import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversed = reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
    }
}

