import java.util.Arrays;
import java.util.LinkedHashSet;

public class NewArray {
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 20, 50, 10};
        int[] uniqueArray = removeDuplicates(numbers);
        System.out.println("New Array: " + Arrays.toString(uniqueArray));
    }
}
