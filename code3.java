public class code3 {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(findIndex(numbers, 30));
    }
}

