import java.util.HashSet;

public class CommonValues {
    public static void findCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) if (set1.contains(num)) common.add(num);
        System.out.println("Common Values: " + common);
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 50, 70, 90, 20};
        findCommon(array1, array2);
    }
}
