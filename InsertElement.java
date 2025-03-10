import java.util.Arrays;

public class InsertElement {
    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) newArr[i] = element;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int element = 25, index = 2;
        int[] newArray = insertElement(numbers, element, index);
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
