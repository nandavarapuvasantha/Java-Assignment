import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] arr, int target) {
        return Arrays.stream(arr).filter(num -> num != target).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int[] newArray = removeElement(numbers, target);
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}

