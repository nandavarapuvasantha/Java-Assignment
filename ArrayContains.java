public class ArrayContains {
    public static boolean containsValue(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println("Contains: " + containsValue(numbers, target));
    }
}

