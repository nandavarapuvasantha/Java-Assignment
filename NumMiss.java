public class NumMiss {
    public static int findMissingNumber(int[] arr) {
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[99];
        int missing = 45;
        for (int i = 0, j = 1; i < 99; j++) {
            if (j != missing) numbers[i++] = j;
        }
        System.out.println("Missing Number: " + findMissingNumber(numbers));
    }
}

