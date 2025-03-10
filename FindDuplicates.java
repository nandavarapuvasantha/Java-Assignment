import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate Values: " + duplicates);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 20, 50, 10};
        findDuplicates(numbers);
    }
}
